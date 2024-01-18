package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
	
	public static void insertRecords() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/home";
		String username="postgres";
		String password="Root";
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement st= con.createStatement();
		String query = " insert into employee values(4,'JayaLakshmi',60000)";
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows Changed is " + rows);
		
		con.close(); 
	}
}
