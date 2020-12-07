package Seccion03.enummeration;

public class testColor2 {
	public static void main(String[] args) {
		color arr[]=color.values();
		
		for(color col:arr) {
			System.out.println(col + " at index "+col.ordinal());
		}
		
		System.out.println(color.valueOf("RED"));
	}
}
