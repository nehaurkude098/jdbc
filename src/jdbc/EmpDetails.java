package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		// 3.create statement
		Statement statement = connection.createStatement();
		// 4.Execute query
		statement.execute("insert into employee values(1,'Shriram',8577754559,'Trainee Er','IT',1,1)");
		statement.execute("insert into employee values(2,'ram',9977754559,'Trainee','IT',1,1)");
		statement.execute("insert into employee values(3,'radha',9877787866,'Manager','IT',2,1)");
		statement.execute("insert into employee values(4,'shiva',867778789,'Sr.Manager','IT support',3,1)");
		statement.execute("insert into employee values(5,'charu',897778789,'TL','IT',2,3)");
		statement.execute("insert into employee values(6,'eshwar',937778789,'Scrummaster','IT',3,4)");
		statement.execute("insert into employee values(7,'chandana',767778789,'CEO','IT',4,3)");
		// 5.close
		connection.close();
		System.out.println("saved successfully");

	}

}
