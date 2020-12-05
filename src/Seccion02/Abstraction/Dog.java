package Seccion02.Abstraction;

public class Dog extends Animal{
	public void sound() {
		System.out.println("guau");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}
}
