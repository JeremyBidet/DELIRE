package administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	
}
