package fr.upem.connector;

import fr.upem.requests.RequestsWithRoleCheck;

import java.sql.SQLException;

/**
 * Created by Jeremy
 */
public class DBSessionManager {

    private static String db_url = "jdbc:mysql://localhost:3306/delire";
    private static String username = "root";
    private static String password = "";

    private static RequestsWithRoleCheck requester;

    static {
        try {
            requester = new RequestsWithRoleCheck(db_url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static RequestsWithRoleCheck request() {
        return requester;
    }

}
