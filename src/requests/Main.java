package requests;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mysql.jdbc.Blob;


public class Main {
	public static void main(String[] args) {

//		String sql="";
//		String url = "jdbc:mysql://sqletud.univ-mlv.fr/jchattou_db";
//		String login="jchattou";
//		String mdp="angels1707";
		String sql="";
		String url = "jdbc:mysql://localhost:3306/gestion_projet?useSSL=false";
		String login="root";
		String mdp="";
		int id;
		String adresse;
		int num_dossier;
		String date_debut;
		String date_fin;
		int personnel_id;
		Date created;
		
		sql = "SELECT * from contact;";
		Connection myCon = null;
//
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			myCon = DriverManager.getConnection(url, login, mdp);
//			Statement st = myCon.createStatement();
//			ResultSet set = st.executeQuery(sql);
//			while (set.next()) {
//				id = set.getInt("Contact_ID");
//				adresse = set.getString("adresse");
//				System.out.println("Voici l'id et l'adresse: " + id + "," + adresse);
//			}
//			ResultSet set = Requests.SELECT_Prescription(myCon, 1);
//			set = Requests.SELECT_PATIENT( myCon, 1);
//			while (set.next()) {
//				id = set.getInt("prescription_id");
//				num_dossier = set.getInt("num_dossier");
//				date_debut = set.getString("date_debut");
//				date_fin = set.getString("date_fin");
//				personnel_id = set.getInt("personnel_id");
//				System.out.println("result: " + id + " " + date_debut + " " + date_fin + " " + personnel_id);

//			}

//			Requests.ADD_DMP_Prescription(myCon, 28,1, "mars", "avril", 1);
//			Requests.ADD_Elements(myCon, 99, "troll", "youhou", 1, "unite1", 2, "unite2", "success");
//			Requests.ADD_Antecedent(myCon, 26);
//			Requests.ADD_Episode(myCon, 1, "LIB");
//			Blob b = (Blob) myCon.createBlob();
//			b.setBytes(1, new byte[10]);
//			Requests.ADD_Doc(myCon, 1, b, 255, 1);
//			ResultSet set = Requests.SELECT_Episode(myCon, 1);
//			while (set.next()) {
//			num_dossier = set.getInt("num_dossier");
//			id = set.getInt("epOuvert_id");
//			date_debut = set.getString("date_debut");
//			date_fin = set.getString("date_derniere_visite");
//			personnel_id = set.getInt("personnel_id");
//
////			System.out.println("result: " + num_dossier + " " + id + " " + examen_type + " " + examen_libelle + " " + personnel_id);
//			System.out.println("result: " + num_dossier + " " + id  + " " + date_debut + " " + date_fin  + " " + personnel_id);
//
//		}
//			List<ResultSet> list = Requests. SEARCH_DMP_BY_FILE_NUMBER(myCon, 1);
//			ResultSet set = list.get(2);
//			while(set.next()) {
//
//					num_dossier = set.getInt("num_dossier");
//					id = set.getInt("epOuvert_id");
//					date_debut = set.getString("date_debut");
//					date_fin = set.getString("date_derniere_visite");
//					personnel_id = set.getInt("personnel_id");		
//					System.out.println("result: " + num_dossier + " " + id  + " " + date_debut + " " + date_fin  + " " + personnel_id);
//			}
			
			ResultSet res = Requests.Login(myCon, "porcel", "passorcel");
			while(res.next()) {
				int user_id = res.getInt("user_id");
				System.out.println("result user_id:" + user_id);
			}
			
		} catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			if(myCon != null) {
				try {
					myCon.close();
				} catch (SQLException ignore) {
					
				}
			}
		}
	}
}
