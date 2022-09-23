package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StuDetails6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc","root","root");
		System.out.println(connection);
		String s="delete from student where id=130";
		PreparedStatement ps=connection.prepareStatement(s);
		ps.execute();
		System.out.println("deleted successfully");
	}

}
