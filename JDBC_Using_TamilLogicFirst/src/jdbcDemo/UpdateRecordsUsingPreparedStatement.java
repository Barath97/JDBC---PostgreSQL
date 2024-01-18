package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecordsUsingPreparedStatement {
	
	public static void updateUsingPreparedStatement() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/home";
		String username="postgres";
		String password="Root";
		Connection con = DriverManager.getConnection(url,username, password);
		String query="insert into employee values (?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		int id=5;
		String name="Sakthi";
		int salary = 50000;
		
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		
		int rows = ps.executeUpdate();
		
		System.out.println("Updated rows are " + rows);
		con.close();
		
	}
}
