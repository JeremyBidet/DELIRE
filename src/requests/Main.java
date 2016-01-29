package requests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String[] args) {

		String sql="";
		String url = "jdbc:mysql://sqletud.univ-mlv.fr/jchattou_db";
		String login="jchattou";
		String mdp="angels1707";
		String id;
		int nb_pattes;
		
//		sql = "SELECT * FROM Animal";
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			Connection myCon = DriverManager.getConnection(url, login, mdp);
//			Statement st = myCon.createStatement();
//			ResultSet set = st.executeQuery(sql);
//			while (set.next()) {
//				id = set.getString("id_espece");
//				nb_pattes = set.getInt("nb_pattes");
//				System.out.println(id + "," + nb_pattes);
//			}
//		} catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e) {
//			e.printStackTrace();
//		}
	}
}
