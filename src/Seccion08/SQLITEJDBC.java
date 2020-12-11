package Seccion08;
import java.sql.*;

public class SQLITEJDBC {
	public static void main(String[] args) {
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c=DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("open satabase succesfully");
	}

}
