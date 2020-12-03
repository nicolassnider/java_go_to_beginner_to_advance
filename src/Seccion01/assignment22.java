//Sunday (domingo). Monday (lunes). Tuesday (martes). Wednesday (miércoles). Thursday (jueves). Friday (viernes). Saturday (sábado).

package Seccion01;

import java.util.Scanner;

public class assignment22 {

	public static void main(String[] args) {
		String[] days = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Fryday","Saturday"};
		String[] months = new String[] {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
		
		int N=0;
		int daysQ=0;
		System.out.println("seleccione mes");
		
		try (Scanner InputDevice = new Scanner(System.in)) {
			N=InputDevice.nextInt();
		}
		if (N == 1 || N == 3 || N == 5 
		        || N == 7 || N == 8 || N == 10 
		        || N == 12) { 
		        daysQ=31; 
		    } 
		  
		    // Check for 30 Days 
		    else if (N == 4 || N == 6 
		             || N == 9 || N == 11) { 
		    	daysQ=30;
		       
		    } 
		  
		    // Check for 28/29 Days 
		    else if (N == 2) { 
		       daysQ=28; 
		    } 
		  
		    // Else Invalid Input 
		    else { 
		        System.out.println("invalid month");
		    }
		
		System.out.println("Month is "+ months[N-1]);
		for (int i = 0; i < daysQ; i++) {			
			
			if (i<=6) {
				System.out.println(days[i]);
			}else if (i>6 && i<=13) {
				System.out.println(days[i-7]);
			}else if (i>13 && i<=20) {
				System.out.println(days[i-7*2]);
			}else if (i>20 && i<=27) {
				System.out.println(days[i-7*3]);
			}else if (i>27 && i<=32) {
				System.out.println(days[i-7*4]);
			}
		}		
		
	}	
	
}
