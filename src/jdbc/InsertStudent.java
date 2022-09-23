package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Load and register Driver
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//explicitly
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcprc", "root", "root");
		System.out.println(connection);
		// 3.create statement
		Statement statement = connection.createStatement();
		// 4.Execute query
		//statement.execute("insert into student values(1,'hari',887778785,'murugeshpalya',450016)");
		statement.execute("insert into student values(2,'ram',9977754559,'murugeshpalya',450014)");
		statement.execute("insert into student values(3,'radha',9877787866,'baswangudi',450019)");
		statement.execute("insert into student values(4,'shiva',867778789,'oar',450025)");
		statement.execute("insert into student values(5,'charu',897778789,'btm',450017)");
		statement.execute("insert into student values(6,'eshwar',937778789,'btm',450018)");
		statement.execute("insert into student values(7,'chandana',767778789,'hebbal',450012)");
		// 5.close
		connection.close();
		System.out.println("saved successfully");

		
	}

}
