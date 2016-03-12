import fr.upem.connector.DBSessionManager;
import fr.upem.requests.*;
import org.primefaces.event.CloseEvent;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy
 */
@ManagedBean(name="dashboard")
@ViewScoped
public class DashboardBean implements Serializable {

    private DashboardModel model;

    private String selectedPatientName;
    private int patientID = -1;
    private int dmpID = -1;

    public DashboardModel getModel() {
        return this.model;
    }

    public String getSelectedPatientName() { return this.selectedPatientName; }
    public void setSelectedPatientName(String selectedPatientName) { this.selectedPatientName = selectedPatientName; }
    public int getPatientID() { return this.patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }
    public int getDmpID() { return this.dmpID; }
    public void setDmpID(int dmpID) { this.dmpID = dmpID; }

    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();

        column1.addWidget("patient_identity");
        column1.addWidget("medical_history");
        column1.addWidget("tracking_episode");

        column2.addWidget("biological_examinations");
        column2.addWidget("documents");
        column2.addWidget("prescriptions");

        model.addColumn(column1);
        model.addColumn(column2);
    }

    public void handleReorder(DashboardReorderEvent event) {
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        message.setSummary("Reordered: " + event.getWidgetId());
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());

        addMessage(message);
    }

    public void handleClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'" + event.getComponent().getId() + "'");

        addMessage(message);
    }

    public void handleToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());

        addMessage(message);
    }

    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public List<String> autocompletePatientName(String query) {
        try {
            List<String> results = new ArrayList<>();
            ResultSet rs = DBSessionManager.request().autocompletePatientName(SessionManager.getUsername(), query);
            while(rs.next()) {
                StringBuilder sb = new StringBuilder();
                sb
                        .append(rs.getString("nom"))
                        .append(' ')
                        .append(rs.getString("prenom"));
                results.add(sb.toString());
            }
            return results;
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void loadPatientIDAndDmpID() {
        try {
            ResultSet rs = DBSessionManager.request().searchPatientIDAndDmpIDByName(SessionManager.getUsername(), this.selectedPatientName);
            while(rs.next()) {
                this.patientID = rs.getInt("patient_id");
                this.dmpID = rs.getInt("num_dossier");
            }
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean checkSelectedPatient() {
        return this.patientID != -1 && this.dmpID != -1;
    }

    public String getPatientIdentity() {
        try {
            if(!checkSelectedPatient()) {
                return "";
            }
            ResultSet rs = DBSessionManager.request().getPatientInfosById(SessionManager.getUsername(), this.patientID);
            rs.next();
            StringBuilder sb = new StringBuilder();
                sb
                        .append("Lastname: ").append(rs.getString("nom")).append("<br/>")
                        .append("Firstname: ").append(rs.getString("prenom")).append("<br/>")
                        .append("NSS: ").append(rs.getString("num_NSS")).append("<br/>")
                        .append("Gender: ").append(rs.getString("sexe")).append("<br/>")
                        .append("Birthdate: ").append(rs.getString("date_naissance")).append("<br/>")
                        .append("Complementary: ").append(rs.getString("mutuelle")).append("<br/>")
                        .append("Address: ").append(rs.getString("adresse")).append("<br/>")
                        .append("City: ").append(rs.getString("ville")).append("<br/>")
                        .append("ZIP Code: ").append(rs.getInt("code_postal")).append("<br/>")
                        .append("Phone: ").append(rs.getString("telephone_fixe")).append("<br/>")
                        .append("Mobile phone: ").append(rs.getString("telephone_mobile")).append("<br/>");
            return sb.toString();
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getTrackingEpisode() {
        try {
            if(!checkSelectedPatient()) {
                return "";
            }
            List<EpisodesEnCours> rs = DBSessionManager.request().getEpisode(SessionManager.getUsername(), this.dmpID);
            StringBuilder sb = new StringBuilder();
            sb.append("<table class=\"table table-striped table-hover table_bordered\">");
                sb.append("<tr>")
                        .append("<th>Start date</th>")
                        .append("<th>Last visit date</th>")
                        .append("<th>Notes</th>");
                sb.append("</tr>");
            for(EpisodesEnCours e : rs) {
                sb.append("<tr>")
                        .append("<td>").append(e.getDate_debut()).append("</td>")
                        .append("<td>").append(e.getDate_derniere_visite()).append("</td>")
                        .append("<td>").append(e.getNotes()).append("</td>");
                sb.append("</tr>");
                if(e.getPathoList().size() > 0) {
                    sb.append("<tr>")
                            .append("<td colspan=\"3\" style=\"padding-left: 100px;\">")
                            .append("<table class=\"table table-striped table-hover table-condensed\">")
                            .append("<tr>")
                            .append("<th>Libelle</th>")
                            .append("<th>Code CIM10</th>")
                            .append("</tr>");
                    for (Pathologies p : e.getPathoList()) {
                        sb.append("<tr>")
                                .append("<td>").append(p.getPatho_libelle()).append("</td>")
                                .append("<td>").append(p.getCodeCIM10()).append("</td>");
                        sb.append("</tr>");
                    }
                    sb.append("</table>");
                    sb.append("</td>");
                    sb.append("</tr>");
                }
            }
            sb.append("</table>");
            return sb.toString();
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getBiologicalExaminations() {
        try {
            if(!checkSelectedPatient()) {
                return "";
            }
            ResultSet rs = DBSessionManager.request().getElements(SessionManager.getUsername(), this.dmpID);
            StringBuilder sb = new StringBuilder();
            while(rs.next()) {
                sb
                        .append("Label: ").append(rs.getString("examen_libelle")).append("<br/>")
                        .append("Type: ").append(rs.getString("examen_type")).append("<br/>")
                        .append("Data 1: ").append(rs.getFloat("valeur_1")).append(" ").append(rs.getString("unite_1")).append("<br/>")
                        .append("Data 2: ").append(rs.getFloat("valeur_2")).append(" ").append(rs.getString("unite_2")).append("<br/>")
                        .append("Result: ").append(rs.getString("resultat_test")).append("<br/>")
                        .append("<br/>");
            }
            return sb.toString();
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getMedicalHistory() {
        try {
            if(!checkSelectedPatient()) {
                return "";
            }
            ResultSet rs = DBSessionManager.request().getAntecedent(SessionManager.getUsername(), this.dmpID);
            StringBuilder sb = new StringBuilder();
            while(rs.next()) {
                sb
                        .append("Allergy label: ").append(rs.getString("allergie_libelle")).append("<br/>")
                        .append("CIM10 code: ").append(rs.getString("code_CIM10")).append("<br/>")
                        .append("Examination label: ").append(rs.getString("examen_libelle")).append("<br/>")
                        .append("Type: ").append(rs.getString("examen_type")).append("<br/>")
                        .append("Start date: ").append(rs.getString("date_debut")).append("<br/>")
                        .append("End date: ").append(rs.getString("date_fin")).append("<br/>")
                        .append("Notes: ").append(rs.getString("notes")).append("<br/>")
                        .append("<br/>");
            }
            return sb.toString();
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getPrescriptions() {
        try {
            if(!checkSelectedPatient()) {
                return "";
            }
            List<Prescription> rs = DBSessionManager.request().getPrescriptions(SessionManager.getUsername(), this.dmpID);
            StringBuilder sb = new StringBuilder();
            sb.append("<table class=\"table table-striped table-hover table_bordered\">");
                sb.append("<tr>")
                        .append("<th>Label</th>")
                        .append("<th>Start date</th>")
                        .append("<th>End date</th>");
                sb.append("</tr>");
            for(Prescription p : rs) {
                sb.append("<tr>")
                        .append("<td>").append(p.getLibelle()).append("</td>")
                        .append("<td>").append(p.getDate_deb()).append("</td>")
                        .append("<td>").append(p.getDate_fin()).append("</td>");
                sb.append("</tr>");
                if(p.getMedList().size() > 0) {
                    sb.append("<tr>")
                            .append("<td colspan=\"3\" style=\"padding-left: 100px;\">")
                            .append("<table class=\"table table-striped table-hover table-condensed\">")
                            .append("<tr>")
                            .append("<th>CIP</th>")
                            .append("<th>Label</th>")
                            .append("<th>DCI label</th>")
                            .append("<th>Format</th>")
                            .append("<th>Dose</th>")
                            .append("</tr>");
                    for (Medicament m : p.getMedList()) {
                        sb.append("<tr>")
                                .append("<td>").append(m.getCIP()).append("</td>")
                                .append("<td>").append(m.getLibelle()).append("</td>")
                                .append("<td>").append(m.getLibelleDCI()).append("</td>")
                                .append("<td>").append(m.getFormat()).append("</td>")
                                .append("<td>").append(m.getDosage()).append("</td>");
                        sb.append("</tr>");
                    }
                    sb.append("</table>");
                    sb.append("</td>");
                    sb.append("</tr>");
                }
            }
            sb.append("</table>");
            return sb.toString();
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getDocuments() {
        try {
            if(!checkSelectedPatient()) {
                return "";
            }
            ResultSet rs = DBSessionManager.request().getDocument(SessionManager.getUsername(), this.dmpID);
            StringBuilder sb = new StringBuilder();
            while(rs.next()) {
                sb
                        .append("Type: ").append(rs.getString("docType")).append("<br/>")
                        .append("Content: ").append(rs.getBlob("contenu")).append("<br/>")
                        .append("Size: ").append(rs.getFloat("size_file")).append("<br/>")
                        .append("Created date: ").append(rs.getDate("created")).append("<br/>")
                        .append("<br/>");
            }
            return sb.toString();
        } catch (NoRightToException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String logout(ActionEvent event) {
        return SessionManager.getUser().logout();
    }

}