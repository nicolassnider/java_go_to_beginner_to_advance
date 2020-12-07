package Seccion02.thisKeyword;

public class this1 {
	public static void main(String[] args) {
		this1 this1 =  new this1();
		this1.methodOne();
		this1.methodTwo();
	}
	
	void methodOne(){
		System.out.println("Inside met 1");
	}
	void methodTwo() {
		System.out.println("Inside met 2");
		this.methodOne();
	}
}
