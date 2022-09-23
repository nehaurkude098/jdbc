package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StuDetails3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		String s="select * from student";
		PreparedStatement ps=connection.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
		}
		
	}

	

}
