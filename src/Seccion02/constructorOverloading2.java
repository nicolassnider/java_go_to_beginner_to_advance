package Seccion02;


public class constructorOverloading2 {
	private int rollNum;

	public constructorOverloading2() {
		// TODO Auto-generated constructor stub
		rollNum = 100;
	}

	constructorOverloading2(int rNum) {
		this();
		rollNum = rollNum + rNum;
	}

	public int getRollNum() {
		return rollNum;
	}
	
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public static void main(String[] args) {
		constructorOverloading2 cOl = new constructorOverloading2();
		constructorOverloading2 cO2 = new constructorOverloading2(14);
		
		System.out.println(cOl.getRollNum());
		System.out.println(cO2.getRollNum());
		
	}

}
