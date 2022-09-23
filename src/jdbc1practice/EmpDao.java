package jdbc1practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/jdbcprc";
	String username = "root";
	String password = "root";
	String query = "select * from employee where floor=?";
	boolean result;

	public Employee getDetailsByFloor(int floor) {
		try {
			Class.forName(path);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, floor);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPhone(rs.getLong(3));
				e.setRole(rs.getString(4));
				e.setBranch(rs.getString(5));
				return e;
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public boolean getDetailsByFloorExecute(int floor) {
		try {
			
			Class.forName(path);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, floor);
			result = ps.execute();

			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
