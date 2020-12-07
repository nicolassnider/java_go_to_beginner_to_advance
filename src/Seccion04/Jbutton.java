package Seccion04;

import javax.swing.*;

public class Jbutton {
	void JButton() {
		JFrame frame = new JFrame("Button ex");
		JButton b = new JButton(new ImageIcon("src:\\swinghierachy.jpg"));
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
