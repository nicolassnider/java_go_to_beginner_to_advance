package Seccion02.Polymorphism;

public class testStaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticPolymorphism staticPolymorphism1 = new staticPolymorphism();
		System.out.println(staticPolymorphism1.add(1, 2));
		System.out.println(staticPolymorphism1.add(1, 2,3));
		System.out.println(staticPolymorphism1.add(1.5, 2));
		System.out.println(staticPolymorphism1.add(1, 2.5));

	}

}
