package Seccion02;

//import java.io.*;

public class constructor {
	int num;
	String name;
	public constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor called");
	}

}

class GFG{
	public static void main(String[] args) {
		constructor constr = new constructor();
		System.out.println(constr.name);
		System.out.println(constr.num);
	}
}
