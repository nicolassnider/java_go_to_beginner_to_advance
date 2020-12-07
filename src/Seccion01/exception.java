package Seccion01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {

	public static void main(String[] args) {
		File file = new File("E:\\Repos\\eclipse-workspace\\java_go_to_beginner_to_advance\\bin\\Seccion01\\file.txt");
		try {
			FileReader f = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
