package fr.upem.administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class RoleAdministration {

	/**
	 * Add role to the dataBase with a roleLabel to recognize this role. This
	 * method accepts an HashMap of <Right, Boolean>.
	 * 
	 * @param conn
	 *            The connection to the database.
	 * @param roleLabel
	 *            The name choose to recognize this role later.
	 * @param rights
	 *            HashMap of boolean values to set the new role. HashMap must
	 *            contains all rights of the enumeration Right.
	 * @throws SQLException
	 */
	public static void addRole(Connection conn, String roleLabel, HashMap<Right, Boolean> rights) throws SQLException {

		// Check hashMap length
		int nbRights = Right.values().length;
		if (rights.size() != nbRights) {
			throw new IllegalArgumentException("The argument 'rights' doesn't contain all rights");
		}

		// Preparing INSERT SQL Query
		PreparedStatement addRoleQuery = (PreparedStatement) conn.prepareStatement(
				"INSERT INTO Droits VALUES (DEFAULT, (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?))");

		// Add roleLabel to the first argument
		addRoleQuery.setString(1, roleLabel);

		// Add right to the others arguments
		for (Map.Entry<Right, Boolean> entry : rights.entrySet()) {
			int rightNo = entry.getKey().getRightNo();
			Boolean value = entry.getValue();
			addRoleQuery.setBoolean(1 + rightNo, value);
		}

		// Executing update query
		try {
			addRoleQuery.executeUpdate();
		} catch (MySQLIntegrityConstraintViolationException sqle) {
			throw new IllegalStateException("The role '" + roleLabel
					+ "' already exists in the database. Please choose other name for this role." + sqle.getMessage());
		}

	}

	/**
	 * Modify an existing role. The roleLabel allows to recognize the exact
	 * role.
	 * 
	 * @param conn
	 *            The connection to the DataBase.
	 * @param roleLabel
	 *            The role to update.
	 * @param rights
	 *            the new right to apply to this role.
	 * @throws SQLException
	 */
	public static void modifyRole(Connection conn, String roleLabel, HashMap<Right, Boolean> rights)
			throws SQLException {
		// Check hashMap length
		int nbRights = Right.values().length;
		if (rights.size() != nbRights) {
			throw new IllegalArgumentException("The argument rights doesn't contain all rights");
		}

		// Preparing Update SQL Query
		PreparedStatement modifyRoleQuery = (PreparedStatement) conn
				.prepareStatement("UPDATE Droits SET droit_lecture_identite_patient = (?), "
						+ "droit_lecture_prescriptions_patient = (?), " + "droit_ecriture_prescriptions_patient = (?), "
						+ "droit_lecture_antecedents_patient = (?), " + "droit_ecriture_antecedents_patient = (?), "
						+ "droit_lecture_episodes_patient = (?), " + "droit_ecriture_episodes_patient = (?), "
						+ "droit_lecture_elementSuivis_patient = (?), " + "droit_ecriture_elementSuivis_patient = (?),"
						+ "droit_ecriture_dossier_patient = (?)," + "droit_lecture_dossiers_patient = (?),"
						+ "droit_ecriture_document_patient = (?)," + "droit_lecture_document_patient = (?)"
						+ "WHERE role_libelle = (?)");

		// Add right to the others arguments
		for (Map.Entry<Right, Boolean> entry : rights.entrySet()) {

			int rightNo = entry.getKey().getRightNo();
			Boolean value = entry.getValue();
			modifyRoleQuery.setBoolean(rightNo, value);
		}
		// Add roleLabel to the last argument
		modifyRoleQuery.setString(nbRights + 1, roleLabel);
		// Executing update query
		modifyRoleQuery.executeUpdate();

	}

	/**
	 * Delete an existing role.
	 * 
	 * @param conn
	 *            The connection to the DataBase.
	 * @param roleLabel
	 *            The role to delete.
	 * @throws SQLException
	 */
	public static void deleteRole(Connection conn, String roleLabel) throws SQLException {
		// Preparing DELETE Query
		PreparedStatement deleteRoleQuery = (PreparedStatement) conn
				.prepareStatement("DELETE FROM Droits WHERE role_libelle = (?)");
		deleteRoleQuery.setString(1, roleLabel);

		// Executing update query
		deleteRoleQuery.executeUpdate();
	}

	/**
	 * Assign an user to a role. The user and the role must be in the DataBase.
	 * 
	 * @param conn
	 *            The connection to the DataBase.
	 * @param userLogin
	 *            The user to assign.
	 * @param roleLabel
	 *            The role to assign.
	 * @throws SQLException
	 */
	public static void roleAssignement(Connection conn, String userLogin, String roleLabel) throws SQLException {

		int userId = selectUserId(conn, userLogin);
		int droitId = selectRoleId(conn, roleLabel);
		roleAssignementWithId(conn, userId, droitId);
	}

	private static void roleAssignementWithId(Connection conn, int userId, int droitId) throws SQLException {
		PreparedStatement insertPossederDroitQuery = (PreparedStatement) conn
				.prepareStatement("INSERT INTO PossederDroits VALUES ((?), (?))");
		insertPossederDroitQuery.setInt(1, userId);
		insertPossederDroitQuery.setInt(2, droitId);

		insertPossederDroitQuery.executeUpdate();
	}

	/**
	 * Remove the assignment between an user and a role. They must both existing
	 * and already assigned.
	 * 
	 * @param conn
	 *            The connection to the DataBase.
	 * @param userLogin
	 *            The user to dismiss.
	 * @param roleLabel
	 *            The role to dismiss.
	 * @throws SQLException
	 */
	public static void roleDismissal(Connection conn, String userLogin, String roleLabel) throws SQLException {
		int userId = selectUserId(conn, userLogin);
		int droitId = selectRoleId(conn, roleLabel);
		roleDismissalWithId(conn, userId, droitId);
	}

	private static void roleDismissalWithId(Connection conn, int userId, int droitId) throws SQLException {
		PreparedStatement deletePossederDroitQuery = (PreparedStatement) conn
				.prepareStatement("DELETE FROM PossederDroits WHERE user_id = (?) AND droit_id = (?)");
		deletePossederDroitQuery.setInt(1, userId);
		deletePossederDroitQuery.setInt(2, droitId);

		deletePossederDroitQuery.executeUpdate();
	}

	private static int getRowCount(ResultSet rs) throws SQLException {
		int rowcount = 0;
		if (rs.last()) {
			rowcount = rs.getRow();
			rs.beforeFirst();
		}
		return rowcount;
	}

	private static int selectUserId(Connection conn, String login) throws SQLException {
		// Get user_id whit userLogin
		PreparedStatement selectUserIdQuery = (PreparedStatement) conn
				.prepareStatement("SELECT user_id FROM Users WHERE login = (?) ");
		selectUserIdQuery.setString(1, login);
		ResultSet rs = selectUserIdQuery.executeQuery();
		int rowcount = getRowCount(rs);
		if (rowcount != 1) {
			throw new IllegalArgumentException(
					"This login doesn't exist in this database or too much result to distinct one");
		}
		while (rs.next()) {
			return rs.getInt("user_id");
		}
		throw new IllegalStateException("No user id");
	}

	private static int selectRoleId(Connection conn, String role) throws SQLException {

		// Get droit_id with roleLabel
		PreparedStatement selectDroitIdQuery = (PreparedStatement) conn
				.prepareStatement("SELECT droit_id FROM Droits WHERE role_libelle = (?) ");
		selectDroitIdQuery.setString(1, role);
		ResultSet rs = selectDroitIdQuery.executeQuery();
		int rowcount = getRowCount(rs);
		if (rowcount != 1) {
			throw new IllegalArgumentException(
					"This role doesn't exist in this database or too much result to distinct one");
		}
		while (rs.next()) {
			return rs.getInt("droit_id");
		}
		throw new IllegalStateException("No role id");
	}

}
