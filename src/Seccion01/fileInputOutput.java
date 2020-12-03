package Seccion01;

import java.io.*;

public class fileInputOutput {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;
			while ((c=in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
