package Seccion02.superKeyword;

public class hr extends employee {
	float salary = 200000;

	public void message() {
		System.out.println("salary " + salary);
	}

	void display() {
		message();
		super.message();
	}
}
