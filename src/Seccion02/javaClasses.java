package Seccion02;

public class javaClasses {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		javaClasses JavaClasses1 = new javaClasses();
		JavaClasses1.setName("nico");
		System.out.println(JavaClasses1.name);
	}

}
