package Seccion02;

public class functionOverloading {

	void display() {
		System.out.println("Method Overloading...");
	}

	void display(int x) {
		System.out.println("Integer Overloading...");
	}

	void display(float x) {
		System.out.println("Float Overloading...");
	}

	void display(char x) {
		System.out.println("Char Overloading...");
	}
	void display(int a, int b) {
		System.out.println("MultiVar Overloading...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionOverloading fo = new functionOverloading();
		
		fo.display();
		fo.display(7);
		fo.display(7.1f);
		fo.display('c');
		fo.display(1,2);
		

	}

}
