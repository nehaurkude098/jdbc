package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class StuDetails {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		String s="insert into student values(?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(s);
		ps.setInt(1, 130);
		ps.setString(2, "sql");
		ps.setLong(3, 9045656636l);
		ps.setString(4, "abc");
		ps.setInt(5, 440165);
		ps.execute();
		connection.close();
		
	}

}
