package administrator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class Main {
	
	/*This method is like a huge test method because unit testing database code is discouraged*/
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:8889/PulseWare";
		String login="root";
		String mdp="root";
		
		Connection myConn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			myConn = DriverManager.getConnection(url, login, mdp);
			
			UsersAdministration.addUser(myConn, "Roger");
			
			HashMap<Right, Boolean> rights = new HashMap<>();
			rights.put(Right.DROIT_ECRITURE_PRESCRIPTIONS_PATIENT, false);
			rights.put(Right.DROIT_ECRITURE_ANTECEDENTS_PATIENT, false);
			rights.put(Right.DROIT_ECRITURE_ELEMENTSUIVIS_PATIENT, false);
			rights.put(Right.DROIT_ECRITURE_EPISODES_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_ANTECEDENTS_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_ELEMENTSUIVIS_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_EPISODES_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_IDENTITE_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_PRESCRIPTIONS_PATIENT, false);
			rights.put(Right.DROIT_ECRITURE_DOCUMENT_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_DOCUMENT_PATIENT, false);
			rights.put(Right.DROIT_ECRITURE_DOSSIER_PATIENT, false);
			rights.put(Right.DROIT_LECTURE_DOSSIER_PATIENT, false);
			
			RoleAdministration.addRole(myConn, "RoleTest", rights);
			
			rights.put(Right.DROIT_ECRITURE_PRESCRIPTIONS_PATIENT, true);
			
			RoleAdministration.modifyRole(myConn, "RoleTest", rights);
			
			RoleAdministration.roleAssignement(myConn, "Roger", "RoleTest");
			
			RoleAdministration.roleDismissal(myConn, "Roger", "RoleTest");
			
			RoleAdministration.deleteRole(myConn, "RoleTest");
			
			UsersAdministration.removeUser(myConn, "Roger");
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(myConn != null) {
				try {
					myConn.close();
				} catch (SQLException ignore) {
					
				}
			}
		}
		
	}
}
