package Seccion02;


public class parametrizedConstructor {
	public parametrizedConstructor(int a, int b) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with two ints");

	}
	
	public parametrizedConstructor(int a,String b) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with int and String");
	}
	
	public static void main(String[] args) {
		parametrizedConstructor parametrizedConstr1= new parametrizedConstructor(1, 2);
		parametrizedConstructor parametrizedConstr2 = new parametrizedConstructor(1, "asd");
	}

}
