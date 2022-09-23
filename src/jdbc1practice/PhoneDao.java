package jdbc1practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneDao {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/jdbcprc";
	String username="root";
	String password="root";
	String query="insert into phone values(?,?,?,?)";
	
	public String savePhoneDetails(Phone p) {
	try {
		Class.forName(path);
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, p.getImei());
		ps.setString(2, p.getBrand());
		ps.setDouble(3, p.getSize());
		ps.setDouble(4, p.getPrice());
		ps.execute();
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "saved";
}
}