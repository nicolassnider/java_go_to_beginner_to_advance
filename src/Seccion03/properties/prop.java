package Seccion03.properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class prop {
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("E:\\Repos\\eclipse-workspace\\java_go_to_beginner_to_advance\\src\\Seccion03\\properties"));
			prop.list(System.out);
			System.out.println(prop.getProperty("File Name"));
			System.out.println(prop.getProperty("Author Name"));
			System.out.println(prop.getProperty("Topic"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
