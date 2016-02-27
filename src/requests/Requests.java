package requests;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Requests {
	
	//Test pour le login , renvoie l'id de l'utilisateur
	public static ResultSet Login(Connection conn, String login, String mdp ) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT user_id FROM Users WHERE login=(?) AND mot_passe=(?)");
		query.setString(1,login);
		query.setString(2, mdp);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	
	//affiche les données d'un patient
	public static ResultSet SELECT_PATIENT(Connection conn, int id) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT* FROM Patients WHERE patient_id= (?)");
		query.setInt(1,id);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	// ======================================
	// =            Filtres de recherche    =
	// ======================================
//	public static List<ResultSet> SEARCH_DMP_BY_FILE_NUMBER(Connection conn, int num_dossier) throws SQLException {
//		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
//		//les 5 parties forment le dossier
//		ResultSet presc = SELECT_Prescription(conn, num_dossier);
//		ResultSet elem = SELECT_Elements(conn, num_dossier);
//		ResultSet epi = SELECT_Episode(conn, num_dossier);
//		ResultSet antec = SELECT_Antecedent(conn, num_dossier);
//		ResultSet doc = SELECT_Doc(conn, num_dossier);
//		//ajout des résultats dans une liste
//		result.add(presc);
//		result.add(elem);
//		result.add(epi);
//		result.add(antec);
//		result.add(doc);
//		
//		return result;
//	}
//	
//	
//
//	public static List<ResultSet> SEARCH_DMP_BY_FIRSTNAME(Connection conn, String firstName) throws SQLException {
//		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier FROM Patients p, Dossiers d WHERE p.patient_id=d.patient_id AND prenom=(?)");
//		query.setString(1, firstName);
//		ResultSet set = query.executeQuery();
//		int num_dossier;
//		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
//		
//		while (set.next()) {
//			num_dossier = set.getInt("num_dossier");
//			//les 5 parties forment le dossier
//			ResultSet presc = SELECT_Prescription(conn, num_dossier);
//			ResultSet elem = SELECT_Elements(conn, num_dossier);
//			ResultSet epi = SELECT_Episode(conn, num_dossier);
//			ResultSet antec = SELECT_Antecedent(conn, num_dossier);
//			ResultSet doc = SELECT_Doc(conn, num_dossier);
//			//les 5 premiers éléments correspondent au 1er numéro de dossier, les 5 autres aux 2ieme, etc...
//			result.add(presc);
//			result.add(elem);
//			result.add(epi);
//			result.add(antec);
//			result.add(doc);
//		}
//		return result;
//	}
//	
//	public static List<ResultSet> SEARCH_DMP_BY_LASTNAME(Connection conn, String lastName) throws SQLException {
//		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier FROM Patients p, Dossiers d WHERE p.patient_id=d.patient_id AND nom=(?)");
//		query.setString(1, lastName);
//		ResultSet set = query.executeQuery();
//		int num_dossier;
//		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
//		
//		while (set.next()) {
//			num_dossier = set.getInt("num_dossier");
//			//les 5 parties forment le dossier
//			ResultSet presc = SELECT_Prescription(conn, num_dossier);
//			ResultSet elem = SELECT_Elements(conn, num_dossier);
//			ResultSet epi = SELECT_Episode(conn, num_dossier);
//			ResultSet antec = SELECT_Antecedent(conn, num_dossier);
//			ResultSet doc = SELECT_Doc(conn, num_dossier);
//			//les 5 premiers éléments correspondent au 1er numéro de dossier, les 5 autres aux 2ieme, etc...
//			result.add(presc);
//			result.add(elem);
//			result.add(epi);
//			result.add(antec);
//			result.add(doc);
//		}
//		return result;
//	}
//	
//	public static List<ResultSet> SEARCH_DMP_BY_PATIENT_ID(Connection conn, int patient_id) throws SQLException {
//	
//		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier FROM Dossiers WHERE patient_id=(?)");
//		query.setInt(1, patient_id);
//		ResultSet set = query.executeQuery();
//		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
//		
//		//ne doit boucler qu'une fois en l'occurence car on ne possède qu'un numéro de dossier par patient
//		while (set.next()) {
//			int num_dossier= set.getInt("num_dossier");
//			//les 5 parties forment le dossier
//			ResultSet presc = SELECT_Prescription(conn, num_dossier);
//			ResultSet elem = SELECT_Elements(conn, num_dossier);
//			ResultSet epi = SELECT_Episode(conn, num_dossier);
//			ResultSet antec = SELECT_Antecedent(conn, num_dossier);
//			ResultSet doc = SELECT_Doc(conn, num_dossier);
//			result.add(presc);
//			result.add(elem);
//			result.add(epi);
//			result.add(antec);
//			result.add(doc);
//		}
//
//		return result;
//	}
	
	
	// ======================================
	// = Ajouts dans les parties du dossier =
	// ======================================
	
	//ajoute un dmp à un patient
	public static void ADD_DMP(Connection conn, String libelle, int patient_id) throws SQLException {
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Dossiers VALUES (NULL,(?),(?),(?))");
		query.setString(1,libelle);
		query.setTimestamp(2, date);
		query.setInt(3,patient_id);
		query.executeUpdate();
	}
	
	// Ajoute à la partie Prescription du dossier les ID du DMP et de la prescription
	public static void ADD_DMP_Prescription(Connection conn, int PRESC_ID,int DMP_ID, String date_deb, String date_fin, int personnel_id) throws SQLException {
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Prescription VALUES ((?),(?),(?),(?),(?),(?))");
		query.setInt(1, PRESC_ID);
		query.setInt(2, DMP_ID);
		query.setString(3, date_deb);
		query.setString(4, date_fin);
		query.setInt(5, personnel_id);
		query.setTimestamp(6, date);;
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Episode(Connection conn, int EPISODE_ID, int DMP_ID, String date_debut, String date_derniere_visite, String notes, int personnel_id) throws SQLException {
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Episodes VALUES ((?),(?),(?),(?),(?),(?),(?))");
		query.setInt(1, EPISODE_ID);
		query.setInt(2, DMP_ID);
		query.setString(3, date_debut);
		query.setString(4, date_derniere_visite);
		query.setString(5, notes);
		query.setInt(6, personnel_id);
		query.setTimestamp(7, date);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Antecedents(Connection conn, int ANTECEDENT_ID, int DMP_ID, String date_debut, String date_fin, String notes, int personnel_id) throws SQLException {
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Antecedents VALUES ((?),(?),(?),(?),(?),(?),(?))");
		query.setInt(1, ANTECEDENT_ID);
		query.setInt(2, DMP_ID);
		query.setString(3, date_debut);
		query.setString(4, date_fin);
		query.setString(5, notes);
		query.setInt(6, personnel_id);
		query.setTimestamp(7, date);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Elements(Connection conn, int ELEMENTS_ID, int DMP_ID, int personnel_id) throws SQLException {
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_ElementsSuivis VALUES ((?),(?),(?),(?))");
		query.setInt(1, ELEMENTS_ID);
		query.setInt(2, DMP_ID);
		query.setInt(3, personnel_id);
		query.setTimestamp(4, date);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Doc(Connection conn, int DOC_ID, int DMP_ID) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_DocumentsPatient VALUES ((?),(?))");
		query.setInt(1, DOC_ID);
		query.setInt(2, DMP_ID);
		query.executeUpdate();
	}
	
	// ======================================
	// =            Dossier  SELECT         =
	// ======================================
		
//	public static ResultSet SELECT_Prescription(Connection conn, int num_dossier) throws SQLException {
//		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier, p.prescription_id, date_debut, date_fin, CIP, Dosage, libelle, libelleDCI, Format FROM Partie_Prescription part, Prescriptions p, Medicaments m, ListeMeds_Pour_Prescriptions l WHERE num_dossier=(?) AND part.prescription_id=p.prescription_id AND l.med_id=m.med_id AND part.prescription_id=l.prescription_id");
//		query.setInt(1,num_dossier);
//		ResultSet set = query.executeQuery();
//		return set;
//	}
	
	public static List<Prescription> GET_Prescription(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier, p.prescription_id, libelle_prescription, date_debut, date_fin FROM Partie_Prescription part, Prescriptions p WHERE num_dossier=(?) AND part.prescription_id=p.prescription_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		
		ArrayList<Prescription> listPresc = new ArrayList<Prescription>();

		//on itere sur l'id de prescription
		while(set.next()) {
			int id_prescription = set.getInt("prescription_id");
			String libelle = set.getString("libelle_prescription");
			String date_debut = set.getString("date_debut");
			String date_fin = set.getString("date_fin");
			Prescription prescr = new Prescription(id_prescription, libelle, date_debut, date_fin);

			PreparedStatement sub_query = (PreparedStatement) conn.prepareStatement("SELECT prescription_id, CIP, libelle, libelleDCI, format, dosage FROM ListeMeds_Pour_Prescriptions l, Medicaments m WHERE prescription_id=(?) AND l.med_id=m.med_id");
			sub_query.setInt(1,id_prescription);
			ResultSet sub_set = sub_query.executeQuery();
			//on itere sur les medicaments
			while(sub_set.next()) {
				int cip = sub_set.getInt("CIP");
				String medlib = sub_set.getString("libelle");
				String libelleDCI = sub_set.getString("libelleDCI");
				String format = sub_set.getString("format");
				String dosage = sub_set.getString("dosage");
				Medicament med = new Medicament(cip, medlib, libelleDCI, format, dosage);
				prescr.addMed(med);
			}
			listPresc.add(prescr);
		}
		
		return listPresc;
	}
		
//	public static ResultSet SELECT_Episode(Connection conn, int num_dossier) throws SQLException {
//		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier, ep.epOuvert_id, episode_libelle, date_debut, date_derniere_visite, notes, patho_libelle, codeCIM10 FROM Partie_Episodes part, EpisodesEnCours ep, Pathologies p, ListePatho_Pour_Episodes l WHERE num_dossier=(?) AND part.epOuvert_id=ep.epOuvert_id AND part.epOuvert_id=l.epOuvert_id AND p.patho_id=l.patho_id");
//		query.setInt(1,num_dossier);
//		ResultSet set = query.executeQuery();
//		return set;
//	}
	
	public static List<EpisodesEnCours> GET_Episode(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier, e.epOuvert_id, date_debut, date_derniere_visite, notes FROM Partie_Episodes part, EpisodesEnCours e WHERE num_dossier=(?) AND part.epOuvert_id=e.epOuvert_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		
		ArrayList<EpisodesEnCours> listEpi = new ArrayList<EpisodesEnCours>();

		//on itere sur l'id de prescription
		while(set.next()) {
			int epOuvert_id = set.getInt("epOuvert_id");
			String date_debut = set.getString("date_debut");
			String date_derniere_visite = set.getString("date_derniere_visite");
			String notes = set.getString("notes");
			EpisodesEnCours epi = new EpisodesEnCours(epOuvert_id, date_debut, date_derniere_visite, notes);

			PreparedStatement sub_query = (PreparedStatement) conn.prepareStatement("SELECT epOuvert_id, patho_libelle, codeCIM10 FROM ListePatho_Pour_Episodes l, Pathologies p WHERE epOuvert_id=(?) AND l.patho_id=p.patho_id");
			sub_query.setInt(1,epOuvert_id);
			ResultSet sub_set = sub_query.executeQuery();
			//on itere sur les pathologies
			while(sub_set.next()) {
				String patho_libelle = sub_set.getString("patho_libelle");
				String codeCIM10 = sub_set.getString("codeCIM10");
				Pathologies pat = new Pathologies(patho_libelle, codeCIM10);
				epi.addPath(pat);
			}
			listEpi.add(epi);
		}
		
		return listEpi;
	}
	
	public static ResultSet SELECT_Antecedent(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT part.antecedent_id, Allergies.allergie_libelle, Allergies.code_CIM10, Examens.examen_libelle, Examens.examen_type, date_debut, date_fin, notes FROM Partie_Antecedents part LEFT JOIN Allergies ON part.antecedent_id = Allergies.antecedent_id LEFT JOIN Examens ON part.antecedent_id = Examens.antecedent_id WHERE num_dossier=(?)");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	public static ResultSet SELECT_Elements(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier, e.ES_id, examen_type, examen_libelle, valeur_1, unite_1, valeur_2, unite_2, resultat_test FROM Partie_ElementsSuivis part, ElementsSuivis e WHERE num_dossier=(?) AND part.ES_id=e.ES_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	public static ResultSet SELECT_Doc(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier, d.doc_id, docType, contenu, size_file, created FROM Partie_DocumentsPatient part, Documents d WHERE num_dossier=(?) AND part.doc_id=d.doc_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	// ======================================
	// =            Prescription             =
	// ======================================

	public static void ADD_Prescription(Connection conn, int id, String libelle, String dosage) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Prescriptions VALUES ((?),(?),(?))");
		query.setInt(1,id);
		query.setString(2,libelle);
		query.setString(3,dosage);
		query.executeUpdate();
	}
		

	// ======================================
	// =            Episode 	            =
	// ======================================
	
	public static void ADD_Episode(Connection conn, int id, String libelle) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO EpisodesEnCours VALUES ((?),(?))");
		query.setInt(1,id);
		query.setString(2,libelle);
		query.executeUpdate();
	}
		
	// ======================================
	// =            Antecedent              =
	// ======================================
	
	public static void ADD_Antecedent(Connection conn, int id) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Antecedents VALUES ((?))");
		query.setInt(1,id);
		query.executeUpdate();
	}
	
	// ======================================
	// =            Elements Suivis         =
	// ======================================
	
	public static void ADD_Elements(Connection conn, int id, String examen_type, String examen_libelle, float valeur1, String unite1, float valeur2, String unite2, String resultat_test) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Elementssuivis VALUES ((?),(?),(?),(?),(?),(?),(?),(?))");
		query.setInt(1,id);
		query.setString(2,examen_type);
		query.setString(3,examen_libelle);
		query.setFloat(4,valeur1);
		query.setString(5,unite1);
		query.setFloat(6,valeur2);
		query.setString(7,unite2);
		query.setString(8,resultat_test);
		query.executeUpdate();
	}
	
	// ======================================
	// =            Documents 	            =
	// ======================================
	public static void ADD_Doc(Connection conn, int id, Blob contenu, float size_file, String docType) throws SQLException {
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Documents VALUES ((?),(?),(?),(?),(?))");
		query.setInt(1,id);
		query.setBlob(2,contenu);
		query.setFloat(3,size_file);
		query.setTimestamp(4,date);
		query.setString(5,docType);
		query.executeUpdate();
	}
		
}
