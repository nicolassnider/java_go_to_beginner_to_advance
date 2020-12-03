package Seccion01;

import java.util.Scanner;

public class elseIfStatement {
	public static void main(String[] args) {
		int age;
		Scanner InputDevice = new Scanner(System.in);
		System.out.println("Enter age: \n");
		age = InputDevice.nextInt();
		InputDevice.close();

		if (age >= 18 && age <= 38) {
			System.out.println("Mas 18 menos de 38");
		} else if (age < 38 && age <= 60) {
			System.out.println("Mas 38 menos de 60");
		}
		else {
			System.out.println("no match");
		}

	}
}
