package Seccion08;

import java.sql.*;

import Seccion01.exception;

public class CreatingATable {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("DB Opened");
			s = c.createStatement();
			String sql = "CREATE TABLE COMPANY (ID INT PRIMARY KEY NOT NULL, NAME TEXT NOT NULL, AGE INT NOT NULL, ADDRESS CHAR(50),SALARY REAL)";
			s.executeUpdate(sql);
			s.cancel();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("Table created");
		}
	}
}
