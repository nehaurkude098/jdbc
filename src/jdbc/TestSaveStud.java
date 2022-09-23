package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSaveStud {

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprc","root","root");
			CallableStatement callableStatement=connection.prepareCall("call save_stud(?,?,?,?,?)");
			callableStatement.setInt(1, 100);
			callableStatement.setString(2, "hit");
			callableStatement.setLong(3, 9056565656l);
			callableStatement.setString(4, "oar1");
			callableStatement.setInt(5, 54566);
			callableStatement.execute();
			System.out.println("saved in database");
			connection.close();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
