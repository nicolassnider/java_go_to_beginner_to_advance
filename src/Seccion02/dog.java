package Seccion02;

public class dog {

	String name;
	String breed;
	int age;
	String color;
	
	public dog(String name, String breed, int age, String color) {
		this.name=name;
		this.breed=breed;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hi!, i´m "+this.getName()+", a "+ this.getColor() +" "  +this.getBreed()+" of "+this.getAge()+ " years old!";
	}
	
	public static void main(String[] args) {
		dog bill = new dog("bilbo", "bichon", 4, "white");
		System.out.println(bill.toString());
	}
}
