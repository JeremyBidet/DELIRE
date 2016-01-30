package requests;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Requests {
	
	//pour les requetes imbriquees (si un jour il y a)
	ResultSet savedRequest;
	
	//affiche les donnees d'un patient
	public static void SELECT_PATIENT(Statement st, int id) throws SQLException {
		String sql="SELECT* FROM Patients WHERE patient_id=" + "'" + id + "';";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Filtres de recherche    =
	// ======================================
	public static void SEARCH_DMP_BY_FILE_NUMBER(Statement st, int num_dossier) throws SQLException {
		SELECT_Prescription(st, num_dossier);
		SELECT_Elements(st, num_dossier);
		SELECT_Episode(st, num_dossier);
		SELECT_Antecedent(st, num_dossier);
		SELECT_Doc(st, num_dossier);
	}
	
	
	//pas fini on doit stocker les valeurs des selects
	public static void SEARCH_DMP_BY_FIRSTNAME(Statement st, String firstName) throws SQLException {
		String sql="SELECT num_dossier FROM Patients WHERE prenom='" + firstName + "';";
		ResultSet set = st.executeQuery(sql);
		int num_dossier;
		
		while (set.next()) {
			num_dossier = set.getInt("num_dossier");
			SELECT_Prescription(st, num_dossier);
			SELECT_Elements(st, num_dossier);
			SELECT_Episode(st, num_dossier);
			SELECT_Antecedent(st, num_dossier);
			SELECT_Doc(st, num_dossier);
		}
	}
	
	//pas fini on doit stocker les valeurs des selects
	public static void SEARCH_DMP_BY_LASTNAME(Statement st, String lastName) throws SQLException {
		String sql="SELECT num_dossier FROM Patients WHERE nom='" + lastName + "';";
		ResultSet set = st.executeQuery(sql);
		int num_dossier;
		
		while (set.next()) {
			num_dossier = set.getInt("num_dossier");
			SELECT_Prescription(st, num_dossier);
			SELECT_Elements(st, num_dossier);
			SELECT_Episode(st, num_dossier);
			SELECT_Antecedent(st, num_dossier);
			SELECT_Doc(st, num_dossier);
		}
	}
	
	public static void SEARCH_DMP_BY_PATIENT_ID(Statement st, int patient_id) throws SQLException {
	
		String sql="SELECT num_dossier FROM Patients WHERE patient_id='" + patient_id + "';";
		ResultSet set = st.executeQuery(sql);
		int num_dossier;
		
		//ne doit boucler qu'une fois en l'occurence car on ne possede qu'un numero de dossier par patient
		while (set.next()) {
			num_dossier = set.getInt("num_dossier");
			SELECT_Prescription(st, num_dossier);
			SELECT_Elements(st, num_dossier);
			SELECT_Episode(st, num_dossier);
			SELECT_Antecedent(st, num_dossier);
			SELECT_Doc(st, num_dossier);
		}

	}
	
	
	// ======================================
	// =            Dossier  Ajouts         =
	// ======================================
	
	//affiche le DMP d'un patient par son ID , il faudra verifier qu'il ne soit pas deja cree
	public static void ADD_DMP(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// Ajoute a la partie Prescription du dossier les ID du DMP et de la prescription
	public static void ADD_DMP_Prescription(Statement st, int DMP_ID, int PRESC_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + PRESC_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Episode(Statement st, int DMP_ID, int EPISODE_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + EPISODE_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Antecedent(Statement st, int DMP_ID, int ANTECEDENT_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + ANTECEDENT_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Elements(Statement st, int DMP_ID, int ELEMENTS_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + ELEMENTS_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Doc(Statement st, int DMP_ID, int DOC_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + DOC_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Dossier  SELECT         =
	// ======================================
		
	public static void SELECT_Prescription(Statement st, int num_dossier) throws SQLException {
		String sql="SELECT p.prescription_id, libelle, dosage, date_debut, date_fin, personnel_id FROM Partie_Prescription part, Prescriptions p WHERE num_dossier='" + num_dossier + "' AND part.prescription_id=p.prescription_id;";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void SELECT_Episode(Statement st, int num_dossier) throws SQLException {
		String sql="SELECT ep.epOuvert_id, episode_libelle, date_debut, date_derniere_visite, notes, personnel_id FROM Partie_Episodes part, EpisodesEnCours ep WHERE num_dossier='" + num_dossier + "' AND part.epOuvert_id=ep.epOuvert_id;";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void SELECT_Antecedent(Statement st, int num_dossier) throws SQLException {
		String sql="SELECT ant.antecedent_id, antecedent_libelle, date_debut, date_fin, notes, personnel_id FROM Partie_Antecedents part, Antecedents ant WHERE num_dossier='" + num_dossier + "' AND part.antecedent_id=ant.antecedent_id;";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void SELECT_Elements(Statement st, int num_dossier) throws SQLException {
		String sql="SELECT e.ES_id, examen_type, examen_libelle, personnel_id FROM Partie_ElementsSuivis part, ElementsSuivis e WHERE num_dossier='" + num_dossier + "' AND part.ES_id=e.ES_id;";
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void SELECT_Doc(Statement st, int num_dossier) throws SQLException {
		String sql="SELECT d.doc_id, contenu, size_file FROM Partie_DocumentsPatient part, Documents d WHERE num_dossier='" + num_dossier + "' AND part.doc_id=d.doc_id;";
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Description             =
	// ======================================

	public static void ADD_Prescription(Statement st, int id, String libelle, String dosage, String date_deb, String date_fin, int personnel_ID, String created) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + libelle + "','" + dosage + "','" + date_deb + "','" + date_fin + "','" + personnel_ID + "','" + created + "');";
		ResultSet set = st.executeQuery(sql);
	}
		

	// ======================================
	// =            Episode 	            =
	// ======================================
	
	public static void ADD_Episode(Statement st, int id, String libelle, String date_deb, String date_derniere, String note, int personnel_ID, String created) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + libelle + "','" + date_deb + "','" + date_derniere + "','" + note + "','" + personnel_ID + "','" + created + "');";
		ResultSet set = st.executeQuery(sql);
	}
		
	// ======================================
	// =            Antecedent              =
	// ======================================
	
	public static void ADD_Antecedent(Statement st, int id, String libelle, String date_deb, String date_fin, String note, int personnel_ID, String created) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + libelle + "','" + date_deb + "','" + date_fin + "','" + note + "','" + personnel_ID + "','" + created + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Elements Suivis         =
	// ======================================
	
	public static void ADD_Elements(Statement st, int id, String date_deb, String examen_type, String examen_libelle, int personnel_ID) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + date_deb + "','" + examen_type + "','" + examen_libelle + "','" + personnel_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Documents 	            =
	// ======================================
	public static void ADD_Doc(Statement st, int id, String contenu, float size_file, String created, int docType_ID) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + contenu + "','" + size_file + "','" + created + "','" + docType_ID + "');";
		ResultSet set = st.executeQuery(sql);
	}
		
}
