package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Establish Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc","root", "root");
		System.out.println(connection);
		//3.create statement
		Statement statement=connection.createStatement();
		//4.Execute query
		statement.execute("insert into emp values(1,'agsd')");
		//5.close
		connection.close();
		System.out.println("saved successfully");
		
	}

}
