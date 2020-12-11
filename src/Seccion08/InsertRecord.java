package Seccion08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("DB Opened");
			c.setAutoCommit(false);
			s = c.createStatement();
			String sql = "INSERT INTO COMPANY"
					+ "(ID,NAME,AGE,ADDRESS,SALARY)"
					+ "VALUES (1,'ASD',25,'QWER',5000.00);";
			s.executeUpdate(sql);
			s.close();
			c.commit();
			c.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("Record inserted");
		}
	}
}
