package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	public String saveStudent(StudentPojo s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setLong(3, s.getPhoneNo());
			ps.setString(4, s.getAddress());
			ps.setInt(5, s.getPin());

			ps.execute();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return "";

	}
}
