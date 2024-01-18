package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
	
	public static void deleteRecords() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/home";
		String username="postgres";
		String password="Root";
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st= con.createStatement();
		int id = 5;
		String query = (" DELETE FROM employee WHERE emp_id = " + id );
		int rows = st.executeUpdate(query);
		
		System.out.println("Numbers of rows deleted are " + rows);
		
		con.close();
	}
}
