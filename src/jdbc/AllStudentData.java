package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllStudentData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc","root","root");
			CallableStatement callableStatement=connection.prepareCall("call allStudent");		
			ResultSet rs=callableStatement.executeQuery();
			while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
			}
			System.out.println("all the data saved in database");
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
