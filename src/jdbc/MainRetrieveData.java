package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainRetrieveData {
	// retrieve data in the form of object
	public StudentPojo getStudentDetails(int id) {
		// 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
			// 3
			PreparedStatement p = con.prepareStatement("select * from student where id = ?");
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();

			StudentPojo s1 = new StudentPojo();
			while (rs.next()) {
				s1.setId(rs.getInt(1));
				s1.setName(rs.getString(2));
				s1.setPhoneNo(rs.getLong(3));
				s1.setAddress(rs.getString(4));
				s1.setPin(rs.getInt(5));
			}
			return s1;

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		MainRetrieveData m = new MainRetrieveData();
		StudentPojo s = m.getStudentDetails(101);
		System.out.println(s);

	}

}
