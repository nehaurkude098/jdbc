package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	public String saveStudent(int id,String name,long phoneNo,String address, int pinNo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc","root","root");
			String s="insert into student values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setLong(3, phoneNo);
			ps.setString(4, address);
			ps.setInt(5, pinNo);
			
			ps.execute();
			con.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "saved";
		
		
	}
}
