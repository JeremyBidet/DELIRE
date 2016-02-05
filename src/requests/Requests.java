package requests;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Requests {
	
	//affiche les donn�es d'un patient
	public static ResultSet SELECT_PATIENT(Connection conn, int id) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT* FROM Patients WHERE patient_id= (?)");
		query.setInt(1,id);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	// ======================================
	// =            Filtres de recherche    =
	// ======================================
	public static List<ResultSet> SEARCH_DMP_BY_FILE_NUMBER(Connection conn, int num_dossier) throws SQLException {
		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
		//les 5 parties forment le dossier
		ResultSet presc = SELECT_Prescription(conn, num_dossier);
		ResultSet elem = SELECT_Elements(conn, num_dossier);
		ResultSet epi = SELECT_Episode(conn, num_dossier);
		ResultSet antec = SELECT_Antecedent(conn, num_dossier);
		ResultSet doc = SELECT_Doc(conn, num_dossier);
		//ajout des r�sultats dans une liste
		result.add(presc);
		result.add(elem);
		result.add(epi);
		result.add(antec);
		result.add(doc);
		
		return result;
	}
	
	
	//pas fini on doit stocker les valeurs des selects
	public static List<ResultSet> SEARCH_DMP_BY_FIRSTNAME(Connection conn, String firstName) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier FROM Patients WHERE prenom=(?)");
		query.setString(1, firstName);
		ResultSet set = query.executeQuery();
		int num_dossier;
		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
		
		while (set.next()) {
			num_dossier = set.getInt("num_dossier");
			//les 5 parties forment le dossier
			ResultSet presc = SELECT_Prescription(conn, num_dossier);
			ResultSet elem = SELECT_Elements(conn, num_dossier);
			ResultSet epi = SELECT_Episode(conn, num_dossier);
			ResultSet antec = SELECT_Antecedent(conn, num_dossier);
			ResultSet doc = SELECT_Doc(conn, num_dossier);
			//les 5 premieres �l�ments correspondent au 1er num�ro de dossier, les 5 autres aux 2ieme, etc...
			result.add(presc);
			result.add(elem);
			result.add(epi);
			result.add(antec);
			result.add(doc);
		}
		return result;
	}
	
	//pas fini on doit stocker les valeurs des selects
	public static List<ResultSet> SEARCH_DMP_BY_LASTNAME(Connection conn, String lastName) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier FROM Patients WHERE nom=(?)");
		query.setString(1, lastName);
		ResultSet set = query.executeQuery();
		int num_dossier;
		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
		
		while (set.next()) {
			num_dossier = set.getInt("num_dossier");
			//les 5 parties forment le dossier
			ResultSet presc = SELECT_Prescription(conn, num_dossier);
			ResultSet elem = SELECT_Elements(conn, num_dossier);
			ResultSet epi = SELECT_Episode(conn, num_dossier);
			ResultSet antec = SELECT_Antecedent(conn, num_dossier);
			ResultSet doc = SELECT_Doc(conn, num_dossier);
			//les 5 premieres �l�ments correspondent au 1er num�ro de dossier, les 5 autres aux 2ieme, etc...
			result.add(presc);
			result.add(elem);
			result.add(epi);
			result.add(antec);
			result.add(doc);
		}
		return result;
	}
	
	public static List<ResultSet> SEARCH_DMP_BY_PATIENT_ID(Connection conn, int patient_id) throws SQLException {
	
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT num_dossier FROM Patients WHERE patient_id=(?)");
		query.setInt(1, patient_id);
		ResultSet set = query.executeQuery();
		int num_dossier;
		ArrayList<ResultSet> result = new ArrayList<ResultSet>();
		
		//ne doit boucler qu'une fois en l'occurence car on ne poss�de qu'un num�ro de dossier par patient
		while (set.next()) {
			num_dossier = set.getInt("num_dossier");
			//les 5 parties forment le dossier
			ResultSet presc = SELECT_Prescription(conn, num_dossier);
			ResultSet elem = SELECT_Elements(conn, num_dossier);
			ResultSet epi = SELECT_Episode(conn, num_dossier);
			ResultSet antec = SELECT_Antecedent(conn, num_dossier);
			ResultSet doc = SELECT_Doc(conn, num_dossier);
			result.add(presc);
			result.add(elem);
			result.add(epi);
			result.add(antec);
			result.add(doc);
		}

		return result;
	}
	
	
	// ======================================
	// = Ajouts dans les parties du dossier =
	// ======================================
	
	//ajoute un dmp � un patient
	public static void ADD_DMP(Connection conn, String libelle, String created, int patient_id) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Prescription VALUES (NULL,(?),(?),(?))");
		query.setString(2,libelle);		
		query.setString(3,created);
		query.setInt(4,patient_id);
		query.executeUpdate();
	}
	
	// Ajoute � la partie Prescription du dossier les ID du DMP et de la prescription
	public static void ADD_DMP_Prescription(Connection conn, int PRESC_ID,int DMP_ID, String date_deb, String date_fin, int personnel_id) throws SQLException {
		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Prescription VALUES ((?),(?),(?),(?),(?),(?))");
		query.setInt(1, PRESC_ID);
		query.setInt(2, DMP_ID);
		query.setString(3, date_deb);
		query.setString(4, date_fin);
		query.setInt(5, personnel_id);
		query.setDate(6, sqlDate);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Episode(Connection conn, int EPISODE_ID, int DMP_ID, String date_debut, String date_derniere_visite, String notes, int personnel_id) throws SQLException {
		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Episode VALUES ((?),(?),(?),(?),(?),(?),(?))");
		query.setInt(1, EPISODE_ID);
		query.setInt(2, DMP_ID);
		query.setString(3, date_debut);
		query.setString(4, date_derniere_visite);
		query.setString(5, notes);
		query.setInt(6, personnel_id);
		query.setDate(7, sqlDate);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Antecedent(Connection conn, int ANTECEDENT_ID, int DMP_ID, String date_debut, String date_fin, String notes, int personnel_id) throws SQLException {
		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Antecedent VALUES ((?),(?),(?),(?),(?),(?),(?)");
		query.setInt(1, ANTECEDENT_ID);
		query.setInt(2, DMP_ID);
		query.setString(3, date_debut);
		query.setString(4, date_fin);
		query.setString(5, notes);
		query.setInt(6, personnel_id);
		query.setDate(7, sqlDate);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Elements(Connection conn, int ELEMENTS_ID, int DMP_ID, int personnel_id) throws SQLException {
		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Elements VALUES ((?),(?),(?),(?)");
		query.setInt(1, ELEMENTS_ID);
		query.setInt(2, DMP_ID);
		query.setInt(3, personnel_id);
		query.setDate(4, sqlDate);
		query.executeUpdate();
	}
	
	public static void ADD_DMP_Doc(Connection conn, int DOC_ID, int DMP_ID) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Partie_Elements VALUES ((?),(?))");
		query.setInt(1, DOC_ID);
		query.setInt(2, DMP_ID);
		query.executeUpdate();
	}
	
	// ======================================
	// =            Dossier  SELECT         =
	// ======================================
		
	public static ResultSet SELECT_Prescription(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT p.prescription_id, dosage, date_debut, date_fin, personnel_id FROM Partie_Prescription part, Prescriptions p WHERE num_dossier=(?) AND part.prescription_id=p.prescription_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	public static ResultSet SELECT_Episode(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT ep.epOuvert_id, episode_libelle, date_debut, date_derniere_visite, notes, personnel_id FROM Partie_Episodes part, EpisodesEnCours ep WHERE num_dossier=(?) AND part.epOuvert_id=ep.epOuvert_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	public static ResultSet SELECT_Antecedent(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT ant.antecedent_id, antecedent_libelle, date_debut, date_fin, notes, personnel_id FROM Partie_Antecedents part, Antecedents ant WHERE num_dossier=(?) AND part.antecedent_id=ant.antecedent_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	public static ResultSet SELECT_Elements(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT e.ES_id, examen_type, examen_libelle, personnel_id FROM Partie_ElementsSuivis part, ElementsSuivis e WHERE num_dossier=(?) AND part.ES_id=e.ES_id;");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	public static ResultSet SELECT_Doc(Connection conn, int num_dossier) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("SELECT d.doc_id, contenu, size_file FROM Partie_DocumentsPatient part, Documents d WHERE num_dossier=(?) AND part.doc_id=d.doc_id");
		query.setInt(1,num_dossier);
		ResultSet set = query.executeQuery();
		return set;
	}
	
	// ======================================
	// =            Description             =
	// ======================================

	public static void ADD_Prescription(Connection conn, int id, String libelle, String dosage) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Prescriptions VALUES ((?),(?),(?)");
		query.setInt(1,id);
		query.setString(2,libelle);
		query.setString(2,dosage);
		query.executeUpdate();
	}
		

	// ======================================
	// =            Episode 	            =
	// ======================================
	
	public static void ADD_Episode(Connection conn, int id, String libelle) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Prescriptions VALUES ((?),(?)");
		query.setInt(1,id);
		query.executeUpdate();
	}
		
	// ======================================
	// =            Antecedent              =
	// ======================================
	
	public static void ADD_Antecedent(Connection conn, int id, String libelle) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Prescriptions VALUES ((?),(?)");
		query.setInt(1,id);
		query.setString(2,libelle);
		query.executeUpdate();
	}
	
	// ======================================
	// =            Elements Suivis         =
	// ======================================
	
	public static void ADD_Elements(Connection conn, int id, String examen_type, String examen_libelle, float valeur1, String unite1, float valeur2, String unite2, String resultat_test) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Prescriptions VALUES ((?),(?),(?),(?)");
		query.setInt(1,id);
		query.executeUpdate();
	}
	
	// ======================================
	// =            Documents 	            =
	// ======================================
	public static void ADD_Doc(Connection conn, int id, Blob contenu, float size_file, String created, int docType_ID) throws SQLException {
		PreparedStatement query = (PreparedStatement) conn.prepareStatement("INSERT INTO Prescriptions VALUES ((?),(?),(?),(?),(?)");
		query.setInt(1,id);
		query.setBlob(2,contenu);
		query.setFloat(3,size_file);
		query.setString(4,created);
		query.setInt(5,docType_ID);
		query.executeUpdate();
	}
		
}
