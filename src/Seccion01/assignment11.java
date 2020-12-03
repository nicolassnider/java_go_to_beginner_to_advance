//Write a program to arrange a set of integer numbers in a ascending order where input will be taken through command line argument
package Seccion01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class assignment11 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<Integer>();  
		Scanner InputDevice = new Scanner(System.in);
		

		for(int i=0;i<10;i++)
		{
			System.out.println(i+1);
			numbers.add(InputDevice.nextInt());
		}
		InputDevice.close();
		
		numbers.sort(null);
		System.out.println(numbers);
	}
	
	

}
