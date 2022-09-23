package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		// 3.create statement
		Statement statement = connection.createStatement();
		// 4.Execute query
		statement.execute("update student set id=1 where name='hari'");
		
		// 5.close
		connection.close();
		System.out.println("saved successfully");

	}

}
