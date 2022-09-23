package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc","root","root");
			CallableStatement cs=con.prepareCall("call fromUser(?)");
			cs.setInt(1, 100);
			ResultSet rs=cs.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getLong(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getInt(5));
				
			}
			System.out.println("**");
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
