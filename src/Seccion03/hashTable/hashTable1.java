package Seccion03.hashTable;

import java.util.*;

public class hashTable1 {
	public static void main(String[] args) {
		Hashtable balance = new Hashtable<>();
		Enumeration names;
		String s;
		double bal;

		balance.put("fayaz", new Double(3256.6565));
		balance.put("khan", new Double(156.23));
		balance.put("daisy", new Double(2032.65));
		balance.put("flower", new Double(-20.09));
		names = balance.keys();
		while (names.hasMoreElements()) {
			s = (String) names.nextElement();
			System.out.println(s + ":" + balance.get(s));
		}
		System.out.println();

		bal = ((Double) balance.get("fayaz")).doubleValue();
		balance.put("fayaz", new Double(bal + 1000));
		System.out.println("Fayaz new balance :" + balance.get("fayaz"));

	}

}
