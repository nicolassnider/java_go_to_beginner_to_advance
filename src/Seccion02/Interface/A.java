package Seccion02.Interface;

public class A implements Printable{
	
	
	public static void main(String[] args) {
		A obj = new A();
		obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print A");
	}
}
