package requests;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Requests {
	
	ResultSet savedRequest;
	
	public static void SELECT_DMP(Statement st) throws SQLException {
		String sql="";
		ResultSet set = st.executeQuery(sql);
		/*while (set.next()) {

		}*/
	}
}
