package Seccion04;
import javax.swing.*;


public class buttonExample {
	public buttonExample() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame("Button ex");
		JButton b = new JButton(new ImageIcon("src:\\swinghierachy.jpg"));
		b.setBounds(100,100,140,140);
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new buttonExample();
	}
}
