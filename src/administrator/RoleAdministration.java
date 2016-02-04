package administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class RoleAdministration {

	public static void addRole(Connection conn, String roleLabel, HashMap<Right, Boolean> rights) throws SQLException{
		
		//Check hashMap length
		int nbRights = Right.values().length;
		if (rights.size() != nbRights){
			throw new IllegalArgumentException("The argument rights do not contains all rights");
		}
		
		//Preparing INSERT SQL Query
		PreparedStatement addRoleQuery = (PreparedStatement) conn
				.prepareStatement("INSERT INTO Droits ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?)) "
											+ "VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?))");
		
		//Add roleLabel to the first argument
		 addRoleQuery.setString(1, "role_libelle");
		 addRoleQuery.setString(11, roleLabel);
		 
		//Add right to the others arguments 
		int i = 2;
		for (Map.Entry<Right, Boolean> entry : rights.entrySet()) {
			
		    Right key = entry.getKey();
		    Boolean value = entry.getValue();
		    addRoleQuery.setString(i, key.getLabel());
		    addRoleQuery.setBoolean(i+nbRights, value);
		    
		    i++;
		}
		
		//Executing update query
		addRoleQuery.executeUpdate();
	}
	
	public static void modifyRole(Connection conn, String roleLabel, HashMap<Right, Boolean> rights) throws SQLException{
		//Check hashMap length
		int nbRights = Right.values().length;
		if (rights.size() != nbRights){
			throw new IllegalArgumentException("The argument rights do not contains all rights");
		}
		
		//Preparing Update SQL Query
		PreparedStatement modifyRoleQuery = (PreparedStatement) conn
				.prepareStatement("UPDATE Droits SET (?) = (?), (?) = (?), (?) = (?), (?) = (?), (?) = (?), (?) = (?), (?) = (?), (?) = (?), (?) = (?)"
						+ "WHERE (?) = (?)");
		
		
		 
		//Add right to the others arguments 
		int i = 1;
		for (Map.Entry<Right, Boolean> entry : rights.entrySet()) {
			
		    Right key = entry.getKey();
		    Boolean value = entry.getValue();
		    modifyRoleQuery.setString(i, key.getLabel());
		    modifyRoleQuery.setBoolean(i+1, value);
		    
		    i+=2;
		}
		//Add roleLabel to the last argument
		 modifyRoleQuery.setString(nbRights*2, "role_libelle");
		 modifyRoleQuery.setString(nbRights*2 + 1, roleLabel);
		//Executing update query
		modifyRoleQuery.executeUpdate();
		
	}
	
	public static void deleteRole(Connection conn, String roleLabel) throws SQLException{
		//Preparing DELETE Query
				PreparedStatement deleteRoleQuery = (PreparedStatement) conn
						.prepareStatement("DELETE FROM Droits WHERE (?) = (?)");
				deleteRoleQuery.setString(1, "role_libelle");
				deleteRoleQuery.setString(2, roleLabel);
				
				//Executing update query
				deleteRoleQuery.executeUpdate();
	}
	
	public static void roleAssignement(Connection conn, String userLogin, String roleLabel) throws SQLException{
		int userId  = -1 , droitId = -1;
		
		//Get user_id whit userLogin
		PreparedStatement selectUserIdQuery = (PreparedStatement) conn.prepareStatement("SELECT user_id FROM Users WHERE login = (?) ");
		selectUserIdQuery.setString(1, userLogin);
		ResultSet set = selectUserIdQuery.executeQuery();
		if(set.getFetchSize() == 1){
			while(set.next()){
				userId = set.getInt("user_id");
			}
		}
		else{
			throw new IllegalArgumentException("Non-valid userLogin");
		}
		
		//Get droit_id with roleLabel
		PreparedStatement selectDroitIdQuery = (PreparedStatement) conn.prepareStatement("SELECT droit_id FROM Droits WHERE role_libelle = (?) ");
		selectDroitIdQuery.setString(1, roleLabel);
		set = selectDroitIdQuery.executeQuery();
		if(set.getFetchSize() == 1){
			while(set.next()){
				droitId = set.getInt("droit_id");
			}
		}
		else{
			throw new IllegalArgumentException("Non-valid RoleLabel");
		}
		
		if(userId != -1 && droitId != -1){
			roleAssignementWithId(conn, userId, droitId);
		}
	}

	
	public static void roleAssignementWithId(Connection conn, int userId, int droitId) throws SQLException{
		PreparedStatement insertPossederDroitQuery = (PreparedStatement) conn.prepareStatement("INSERT INTO PossederDroits VALUES ((?), (?))");
		insertPossederDroitQuery.setInt(1, userId);
		insertPossederDroitQuery.setInt(2, droitId);
		
		insertPossederDroitQuery.executeUpdate();
	}
	
	public static void roleDismissal(Connection conn, int userId, int droitId) throws SQLException{
		PreparedStatement deletePossederDroitQuery = (PreparedStatement) conn.prepareStatement("DELETE FROM PossederDroits WHERE user_id = (?) AND droit_id = (?)");
		deletePossederDroitQuery.setInt(1, userId);
		deletePossederDroitQuery.setInt(2, droitId);
		
		deletePossederDroitQuery.executeUpdate();
	}
	
	
}
