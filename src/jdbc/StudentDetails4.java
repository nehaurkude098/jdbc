package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDetails4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		String s="insert into student values(?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(s);
		ps.setInt(1, 111);
		ps.setString(2, "ali");
		ps.setLong(3, 9887476456l);
		ps.setString(4, "shila");
		ps.setInt(5, 15660);
		ps.execute();
		System.out.println("Successfully inserted details");
		
		
		
	}

}
