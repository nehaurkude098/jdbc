package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StuDetails5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc", "root", "root");
	System.out.println(connection);
	Scanner sc=new Scanner(System.in);
	System.out.println("update name");
	String name=sc.next();
	System.out.println("where id is");
	int id=sc.nextInt();
	
	String s1="update student set name=? where id=?";
	
	PreparedStatement ps=connection.prepareStatement(s1);
	ps.setString(1, name);
	ps.setInt(2, id);
	ps.execute();
	System.out.println("updated ");
	connection.close();
	
}
}
