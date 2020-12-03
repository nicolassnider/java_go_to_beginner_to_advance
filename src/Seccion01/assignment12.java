//Write a program to accept the following city name as argument in the command line and sort them in alphabetic order 
//-city name = Sydney, London, Dublin, Toronto, Auckland , Melbourne
package Seccion01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class assignment12 {

	public static void main(String[] args) {
		List<String> cities=new ArrayList<String>();
		try (Scanner InputDevice = new Scanner(System.in)) {
			String city;
			boolean end=false;
			while (!end) {
				city=InputDevice.nextLine();			
				
				switch (city) {
				case "Sydney": {
					cities.add(city);
					break;
					
				}
				
				case "London": {
					cities.add(city);
					break;
					
				}
				case  "zzz":
					end=true;	
					break;
					
				}
				
			}
		}
		
		cities.sort(null);
		
		System.out.println("cities "+cities);
	}
}
