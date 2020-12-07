package Seccion02.multiThreading;

public class testMultiThreading {

	public static void main(String[] args) {

		multiThreading mt = new multiThreading();
		mt.run();

		try {
			while (mt.isAlive()) {
				System.out.println("main thread alive till child thread is live");
				Thread.sleep(1500);
			}

		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main thread interrupted");
		}
		System.out.println("Main thread is run over");

	}

}
