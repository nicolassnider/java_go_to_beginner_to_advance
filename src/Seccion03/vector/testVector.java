package Seccion03.vector;

import java.util.*;

public class testVector {
	public static void main(String args[]) {
		Vector v = new Vector(3, 2);
		System.out.println("Initial Size:" + v.size());
		System.out.println("Iniatial Capacity :" + v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additons" + v.capacity());

		v.addElement(new Double(5.45));
		System.out.println("Current Capacity " + v.capacity());

		v.addElement(new Double(6.05));
		v.addElement(new Integer(7));
		System.out.println("Current Capacity " + v.capacity());

		v.addElement(new Float(9.3));
		v.addElement(new Integer(10));
		System.out.println("Current capacity" + v.capacity());

		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First Element" + (Integer) v.firstElement());
		System.out.println("last Element:" + (Integer) v.lastElement());
		if (v.contains(new Integer(3))) {
			System.out.println("vector contains 3.");

			Enumeration vEnum = v.elements();
			System.out.println("\n Element is vector:");
			while (vEnum.hasMoreElements()) {
				System.out.println(vEnum.nextElement() + "");
				System.out.println();
			}
		}
	}
}
