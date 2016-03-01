package fr.upem.connector;

import fr.upem.requests.RequestsWithRoleCheck;

import java.sql.SQLException;

/**
 * Created by Jeremy
 */
public class DBSessionManager {

    private static String db_url = "jdbc:mysql://sqletud.univ-mlv.fr/jchattou_db";
    private static String username = "jchattou";
    private static String password = "angels1707";

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
