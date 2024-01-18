package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRecords {
	
	
	public static void readRecords() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/home";
		String username="postgres";
		String password="Root";
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM employee");
		
		while(rs.next()) {
			System.out.println("ID - "+ rs.getInt(1));
			System.out.println("Name - " + rs.getString(2));
			System.out.println("Salary - " + rs.getInt(3));
		}
		
		con.close();
	}
}
