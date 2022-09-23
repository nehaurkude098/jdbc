package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StuDetails1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		
		Statement statement = connection.createStatement();
		System.out.println("Student details:");
		ResultSet rs=statement.executeQuery("Select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getNString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
		}
		
		connection.close();
	}

}
