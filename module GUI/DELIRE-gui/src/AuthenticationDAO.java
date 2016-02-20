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

    public static boolean validate(String username, String password, String rpps) {
        // TODO: call query database interface here
        ResultSet rs = null; // ps.executeQuery();
        // REGION DEBUG
        if(true) {
            return true;
        }
        // REGION END
        try {
            if (rs.next()) {
                return true; //result found, means valid inputs
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch(NullPointerException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
