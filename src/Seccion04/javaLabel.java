package Seccion04;
import javax.swing.*;


public class javaLabel {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Label ex");
		JLabel l1,l2;
		l1 = new JLabel("First label");
		l1.setBounds(50,50,100,350);
		l2 = new JLabel("Second label");
		l1.setBounds(50,50,100,30);
		
		f.add(l1);
		f.add(l2);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}	

}
