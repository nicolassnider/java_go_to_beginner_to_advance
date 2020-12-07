package Seccion02.multiThreading;

public class multiThreading extends Thread {

	/*
	 * public void run() { System.out.println("Thread is in running state"); }
	 */

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("printing " + i);
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread interrupted");
		}
	}

	multiThreading() {
		super("my extending thread");
		System.out.println("Thread created");
	}
}
