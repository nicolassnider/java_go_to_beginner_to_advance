package Seccion04;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton {
	void JButton() {
		JFrame frame = new JFrame();
		JButton b = new JButton("Click me");
		b.setBounds(50, 40, 90, 50);
		frame.add(b);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Jbutton();
	}

}
