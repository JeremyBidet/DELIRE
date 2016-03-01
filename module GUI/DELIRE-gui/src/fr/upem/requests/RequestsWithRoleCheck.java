package fr.upem.requests;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RequestsWithRoleCheck {

    private final Connection connection;
    private final boolean unitTest;

    public RequestsWithRoleCheck(String url, String login, String mdp) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, login, mdp);
        unitTest = false;
    }

    protected RequestsWithRoleCheck(String url, String login, String mdp, boolean unitTest) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, login, mdp);
        this.unitTest = unitTest;
    }

    private boolean hasRight(String user, String askedRight) throws SQLException {

        PreparedStatement query = connection.prepareStatement("SELECT user_id FROM Users WHERE login = (?)");
        query.setString(1, user);
        ResultSet resultSet = query.executeQuery();
        resultSet.next();
        int user_id = resultSet.getInt("user_id");

        String sql = "SELECT droit_id FROM Droits WHERE " + askedRight + "= ?";
        query = connection.prepareStatement(sql);
        query.setBoolean(1, true);
        resultSet = query.executeQuery();
        LinkedList<Integer> right_ids = new LinkedList<>();
        while(resultSet.next()){
            right_ids.add(resultSet.getInt("droit_id"));
        }

        query = connection.prepareStatement("SELECT droit_id FROM Possederdroits WHERE user_id = (?)");
        query.setInt(1, user_id);
        resultSet = query.executeQuery();
        resultSet.next();
        int right_idOfUser = resultSet.getInt("droit_id");
        return right_ids.contains(right_idOfUser);
    }

    private void testRights(String user, String askedRight) throws NoRightToException, SQLException {
        if(!hasRight(user, askedRight)){
            throw new NoRightToException("The user " + user + " does not own the rights to " + askedRight);
        }
    }

    private void testAllReadingRights(String user) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_prescriptions_patient");
        testRights(user, "droit_lecture_antecedents_patient");
        testRights(user, "droit_lecture_episodes_patient");
        testRights(user, "droit_lecture_elementSuivis_patient");
        testRights(user, "droit_lecture_documents_patient");
    }

    public ResultSet login(String login, String password) throws SQLException {
        return Requests.Login(connection, login, password);
    }

    public ResultSet autocompletePatientName(String user, String patient_name) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_identite_patient");
        if(!unitTest) {
            return Requests.AUTOCOMPLETE_PATIENT_NAME(connection, patient_name);
        }
        return null;
    }

    public ResultSet searchPatientIDAndDmpIDByName(String user, String patient_name) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_identite_petient");
        if(!unitTest) {
            return Requests.SEARCH_PATIENT_ID_AND_DMP_ID_BY_NAME(connection, patient_name);
        }
        return null;
    }

    public ResultSet getPatientInfosById(String user, int id) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_identite_patient");
        if(!unitTest){
            return Requests.SELECT_PATIENT(connection, id);
        }
        return null;
    }

    public List<Object> getFullDMPByDMPId(String user, int dmp_id) throws NoRightToException, SQLException {
        testAllReadingRights(user);
        if(!unitTest){
            return Requests.SEARCH_DMP_BY_FILE_NUMBER(connection, dmp_id);
        }
        return null;
    }

    public List<Object> getFullDMPByFirstName(String user, String firstName) throws NoRightToException, SQLException {
        testAllReadingRights(user);
        if(!unitTest){
            return Requests.SEARCH_DMP_BY_FIRSTNAME(connection, firstName);
        }
        return null;
    }

    public List<Object> getFullDMPByLastName(String user, String lastName) throws NoRightToException, SQLException {
        testAllReadingRights(user);
        if(!unitTest){
            return Requests.SEARCH_DMP_BY_LASTNAME(connection, lastName);
        }
        return null;
    }

    public List<Object> getFullDMPByPatientId(String user, int patient_id) throws NoRightToException, SQLException {
        testAllReadingRights(user);
        if(!unitTest){
            return Requests.SEARCH_DMP_BY_PATIENT_ID(connection, patient_id);
        }
        return null;
    }

    public void addDossier(String user, String libelle, int patient_id) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_dossier_patient");
        if(!unitTest){
            Requests.ADD_DMP(connection, libelle, patient_id);
        }
    }

    public void addDMPPrescription(String user, int presc_id,int dmp_id, String date_deb, String date_fin, int personnel_id) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_prescriptions_patient");
        if(!unitTest){
            Requests.ADD_DMP_Prescription(connection, presc_id, dmp_id, date_deb, date_fin, personnel_id);
        }
    }

    public void addDMPEpisode(String user, int episode_id, int dmp_id, String date_debut, String date_derniere_visite, String notes, int personnel_id) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_episodes_patient");
        if(!unitTest){
            Requests.ADD_DMP_Episode(connection, episode_id, dmp_id, date_debut, date_derniere_visite, notes, personnel_id);
        }
    }

    public void addDMPAntecedent(String user, int antecedent_id, int dmp_id, String date_debut, String date_fin, String notes, int personnel_id) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_antecedents_patient");
        if(!unitTest){
            Requests.ADD_DMP_Antecedents(connection, antecedent_id, dmp_id, date_debut, date_fin, notes, personnel_id);
        }
    }

    public void addDMPElements(String user, int element_id, int dmp_id, int personnel_id) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_elementSuivis_patient");
        if(!unitTest){
            Requests.ADD_DMP_Elements(connection, element_id, dmp_id, personnel_id);
        }
    }

    public void addDMPDocument(String user, int document_id, int dmp_id) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_documents_patient");
        if(!unitTest){
            Requests.ADD_DMP_Doc(connection, document_id, dmp_id);
        }
    }

    public List<Prescription> getPrescriptions(String user, int num_dossier) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_prescriptions_patient");
        if(!unitTest){
            return Requests.GET_Prescription(connection, num_dossier);
        }
        return null;
    }

    public List<EpisodesEnCours> getEpisode(String user, int num_dossier) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_episodes_patient");
        if(!unitTest){
            return Requests.GET_Episode(connection, num_dossier);
        }
        return null;
    }

    public ResultSet getAntecedent(String user, int num_dossier) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_antecedents_patient");
        if(!unitTest){
            return Requests.SELECT_Antecedent(connection, num_dossier);
        }
        return null;
    }

    public ResultSet getElements(String user, int num_dossier) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_elementSuivis_patient");
        if(!unitTest){
            return Requests.SELECT_Elements(connection, num_dossier);
        }
        return null;
    }

    public ResultSet getDocument(String user, int num_dossier) throws NoRightToException, SQLException {
        testRights(user, "droit_lecture_documents_patient");
        if(!unitTest){
            return Requests.SELECT_Doc(connection, num_dossier);
        }
        return null;
    }

    public void addPrescription(String user, int id, String libelle, String dosage) throws NoRightToException, SQLException {
        testRights(user, "droit_ecriture_prescriptions_patient");
        if(!unitTest){
            Requests.ADD_Prescription(connection, id, libelle, dosage);
        }
    }

    public void addEpisode(String user, int id, String libelle)throws NoRightToException, SQLException{
        testRights(user, "droit_ecriture_episodes_patient");
        if(!unitTest){
            Requests.ADD_Episode(connection, id, libelle);
        }
    }

    public void addAntecedent(String user, int id) throws NoRightToException, SQLException{
        testRights(user, "droit_ecriture_antecedents_patient");
        if(!unitTest){
            Requests.ADD_Antecedent(connection, id);
        }
    }

    public void addElement(String user, int id, String examen_type, String examen_libelle, float valeur1, String unite1, float valeur2, String unite2, String resultat_test) throws NoRightToException, SQLException{
        testRights(user, "droit_ecriture_elementSuivis_patient");
        if(!unitTest){
            Requests.ADD_Elements(connection, id, examen_type, examen_libelle, valeur1, unite1, valeur2, unite2, resultat_test);
        }
    }

    public void addDocument(String user, int id, Blob contenu, float size_file, String docType)throws NoRightToException, SQLException{
        testRights(user, "droit_ecriture_documents_patient");
        if(!unitTest){
            Requests.ADD_Doc(connection, id, contenu, size_file, docType);
        }
    }
}
