package Seccion03.enummeration;

public enum color2 {
	red,green,blue;
	
	private color2() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor called for: "+this.toString());
	}
	public void colorInfo() {
		System.out.println("universal color");
	}
}
