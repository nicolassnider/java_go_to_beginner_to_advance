package Seccion02;

public class bmw1s extends BMW {
	public bmw1s() {
		// TODO Auto-generated constructor stub
		System.out.println("model: BMW1s");
	}
	
	public void speed() {
		System.out.println("max: 180 kmph");
	}
	
	public static void main(String[] args) {
		bmw1s bmw1s = new bmw1s();
		bmw1s.vehicleType();
		bmw1s.brand();
		bmw1s.speed();
	}

}
