import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PhotoSpotJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "root");
		if(conn != null)
			System.out.println("Connection established succesfully to database");
		else
			System.out.println("Failed to connect  to database");
		conn.close();
	}

}
