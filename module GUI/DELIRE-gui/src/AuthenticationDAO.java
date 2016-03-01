import fr.upem.connector.DBSessionManager;
import fr.upem.requests.Requests;
import fr.upem.requests.RequestsWithRoleCheck;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

/**
 * Created by Jeremy
 */
public class AuthenticationDAO {

    private static String db_url = "jdbc:mysql://sqletud.univ-mlv.fr/jchattou_db";
    private static String username = "jchattou";
    private static String password = "angels1707";

    public static boolean validate(String username, String password, String rpps) {
        try {
            ResultSet rs = DBSessionManager.request().login(username, password);
            if(rs.next()) {
                rs.getInt("user_id");
                return true; //result found, means valid inputs
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
