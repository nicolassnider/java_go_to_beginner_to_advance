package Seccion02;

public class constructorOverloading {
	int id;
	String name;
	int age;
	
	public constructorOverloading(int i, String n) {
		// TODO Auto-generated constructor stub
		id=i;
		name=n;
	}
	
	public constructorOverloading(int i, String n, int a) {
		// TODO Auto-generated constructor stub
		id=i;
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	
	public static void main(String[] args) {
		constructorOverloading constOverloading1 = new constructorOverloading(12, "asd");
		constructorOverloading constOverloading2 = new constructorOverloading(112, "aaa", 5);
		
		constOverloading1.display();
		constOverloading2.display();
	}
}
