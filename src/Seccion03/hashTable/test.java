package Seccion03.hashTable;

import java.util.*;
import java.lang.*;
import java.io.*;

public class test {
	public static void main(String args[]) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(120, "fayaz");
		ht.put(200, "khan");
		ht.put(120, "flower");
		System.out.println("__ HASH TABLE_____");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());

		}

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "daisy");
		hm.put(101, "daisy");
		hm.put(102, "flower");

		System.out.println("_______________ hash Map________________");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}

	}

}
