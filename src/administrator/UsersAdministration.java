package administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Random;

public class UsersAdministration {

	private static final String CHARACTER_ALLOWED = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int PASSWORD_LENGTH = 8;
	  
	  public static String generateString( String characters, int length)
	  {
		  Random rng = new Random();
	      char[] text = new char[length];
	      for (int i = 0; i < length; i++)
	      {
	          text[i] = characters.charAt(rng.nextInt(characters.length()));
	      }
	      return new String(text);
	  }
	public static void addUser(Connection conn, String login) throws SQLException{
		Objects.requireNonNull(login);
		//Creation date in dateTime format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy' 'HH:mm:ss");
		String creationDate = simpleDateFormat.format(new Timestamp(System.currentTimeMillis()));
		
		//Generate alpha-numeric password with 8 characters
		String password = generateString(CHARACTER_ALLOWED, PASSWORD_LENGTH);
		
		//Preparing INSERT SQL Query
		PreparedStatement addUserQuery = (PreparedStatement) conn
				.prepareStatement("INSERT INTO Users ((?), (?), (?)) VALUES ((?), (?), (?))");
		addUserQuery.setString(1, "login");
		addUserQuery.setString(2, "mot_passe");
		addUserQuery.setString(3, "created");
		addUserQuery.setString(4, login);
		addUserQuery.setString(5, password);
		addUserQuery.setString(6, creationDate);
		
		//Executing update query
		addUserQuery.executeUpdate();
	}
	
	public static void removeUser(Connection conn, String login) throws SQLException{
		
		//Preparing DELETE Query
		PreparedStatement removeUserQuery = (PreparedStatement) conn
				.prepareStatement("DELETE FROM Users WHERE (?) = (?)");
		removeUserQuery.setString(1, "login");
		removeUserQuery.setString(2, login);
		
		//Executing update query
		removeUserQuery.executeUpdate();
	}
	
	
}
