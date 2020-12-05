package Seccion02.Polymorphism;

public class testCar {
	public static void main(String[] args) {
		vehicle vh = new car();
		vh.move();
		
		vh = new vehicle();
		vh.move();
	}

}
