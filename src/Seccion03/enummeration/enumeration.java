package Seccion03.enummeration;

import java.util.Vector;
import java.util.Enumeration;

public class enumeration {
	public static void main(String args[]) {
		Enumeration days;
		Vector dayNames = new Vector();
		dayNames.add("Sun");
		dayNames.add("Mon");
		dayNames.add("Tue");
		dayNames.add("Wed");
		dayNames.add("Thu");
		dayNames.add("Fri");
		dayNames.add("Sat");
		
		days = dayNames.elements();
		
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
			
		}
		
	}
}
