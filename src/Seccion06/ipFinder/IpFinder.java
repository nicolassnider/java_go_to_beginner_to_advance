package Seccion06.ipFinder;
import javax.swing.*;

import sun.net.InetAddressCachePolicy;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class IpFinder extends JFrame implements ActionListener {
	JLabel l;
	JTextField tf;
	JButton b;
	
	IpFinder(){
		super("IP Finder in this Section");
		l=new JLabel("Enter your address");
		l.setBounds(90,70,150,20);
		tf= new JTextField();
		tf.setBounds(50,100,200,20);
		b = new JButton("Find your ip Adress");
		b.setBounds(50, 150, 80, 30);
		b.addActionListener(this);
		add(l);
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IpFinder();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String url = tf.getText();
		
		try {
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			JOptionPane.showMessageDialog(this, ip);
		} catch (UnknownHostException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, e.toString());
		}
	}
}
