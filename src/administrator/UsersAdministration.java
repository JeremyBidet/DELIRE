package administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class UsersAdministration {

	private static final String CHARACTER_ALLOWED = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int PASSWORD_LENGTH = 8;

	private static String generateString(String characters, int length) {
		Random rng = new Random();
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}

	/**
	 * Add a new user to the DataBase. The user get a generate password.
	 * @param conn The connection to the DataBase.
	 * @param login The login of the new user.
	 * @throws SQLException
	 */
	public static void addUser(Connection conn, String login) throws SQLException {
		Objects.requireNonNull(login);
		// Creation date in dateTime format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
		String creationDate = simpleDateFormat.format(new Timestamp(System.currentTimeMillis()));

		// Generate alpha-numeric password with 8 characters
		String password = generateString(CHARACTER_ALLOWED, PASSWORD_LENGTH);
		String passwordCrypted = DigestUtils.sha1Hex(password);

		// Preparing INSERT SQL Query
		PreparedStatement addUserQuery = (PreparedStatement) conn
				.prepareStatement("INSERT Into Users VALUES (DEFAULT, ?, ?, ?, ?)");

		addUserQuery.setString(1, login);
		addUserQuery.setString(2, passwordCrypted);
		addUserQuery.setString(3, creationDate);
		addUserQuery.setNull(4, java.sql.Types.INTEGER);

		// Executing update query
		try {
			addUserQuery.executeUpdate();
		} catch (MySQLIntegrityConstraintViolationException sqle) {
			throw new IllegalStateException(
					"The login '" + login + "' already exists in the database. Please choose other one." + sqle.getMessage());
		}
	}

	/**
	 * Remove an existing user.
	 * @param conn The connection to the DataBase.
	 * @param login The user login to delete.
	 * @throws SQLException
	 */
	public static void removeUser(Connection conn, String login) throws SQLException {

		// Preparing DELETE Query
		PreparedStatement removeUserQuery = (PreparedStatement) conn
				.prepareStatement("DELETE FROM Users WHERE login = (?)");

		removeUserQuery.setString(1, login);

		// Executing update query
		removeUserQuery.executeUpdate();
	}

}
