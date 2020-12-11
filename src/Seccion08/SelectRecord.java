package Seccion08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecord {
	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("DB Opened");
			c.setAutoCommit(false);
			s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM COMPANY");
			
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				float salary = rs.getFloat("salary");
				
				System.out.println( id +" "+name +" "+age +" "+address +" "+salary);
			}
			rs.close();
			s.close();
			c.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("Record selected");
		}
	}
}
