package Seccion02.FunctionOverriding;

public class boy extends human{

	public void eat() {
		System.out.println("eating as a boy");
	}
	
	public static void main(String[] args) {
		boy b = new boy();
		
		b.eat();
	}
}
