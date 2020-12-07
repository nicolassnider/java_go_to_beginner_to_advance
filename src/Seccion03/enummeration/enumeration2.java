package Seccion03.enummeration;

public class enumeration2 {
	
	public static void main(String[] args) {
		enummerationTester lang;
		
		System.out.println("constant list");
		
		enummerationTester alltypes[]=enummerationTester.values();
		
		for(enummerationTester a:alltypes) {
			System.out.println(a);
			System.out.println();
			lang = enummerationTester.valueOf("assembly");
			System.out.println("values is "+lang);
		}
		
		
	}

}
