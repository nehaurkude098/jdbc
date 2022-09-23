package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class StudentsDao {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/jdbcprc";
	String username="root";
	String password="root";
	String query="Select * from student where id=?";
	public Students getDetails(int id) {
	try {
		Class.forName(path);
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			Students s=new Students();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));	
			s.setPhoneNo(rs.getLong(3));
			s.setAddress(rs.getString(4));
			s.setPin(rs.getInt(5));
			return s;
		}
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	
	}
	
	

}
