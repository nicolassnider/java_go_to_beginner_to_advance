/*Your company pays its sales staff on a commission basis.Each employee receives $500 per week plus 6.5% of their sales. 
For example, a salesperson who sells $10,000 worth of products will get a salary of 500 + (10000 * .065) or $1150 for that week.

You are given the task of creating a program to allow a manager to enter in the sales for 10 employees. 
(Store them in an array of course.) Then it should display the 10 sales amounts, the 10 salaries for this pay period, and the average 
salary.*/

package Seccion01;

import java.util.ArrayList;
import java.util.List;

public class assignment33 {
	
	
	public static void main(String[] args) {
	
		float base = 500;
		float[] ventas = new float[] {10000,10500,11000,11500,12000,12500,13000,13500,14000,14500};
		float comision = (float) 0.065;
		List<Float> totales=new ArrayList<Float>();
		int empleados=10;
		
		for (int i = 0; i < empleados; i++) {
			float total = base + ventas[i]*comision;
			totales.add(total);
		}
		
		System.out.println("totales\n"+totales);
		
		float sumatoria=0;
		for (Float float1 : totales) {
			sumatoria += float1;
			
		}
		
		float average = sumatoria/totales.size();
		System.out.println("average is "+average);
	}
	
	
	
}

