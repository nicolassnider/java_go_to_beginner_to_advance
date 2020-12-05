package Seccion02.Interface;

public class testInterface {
	public static void main(String[] args) {
		Bank b = new BankI();
		System.out.println("ROI "+ b.rateOfInterest());
		
		Bank b2 = new BankI2();
		System.out.println("ROI "+b2.rateOfInterest());
	}
}
