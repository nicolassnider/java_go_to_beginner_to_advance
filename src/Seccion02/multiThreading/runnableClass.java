package Seccion02.multiThreading;

public class runnableClass implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		runnableClass rn = new runnableClass();
		Thread obj = new Thread(rn);
		
		obj.start();
		int i=0;
		while (obj.isAlive() && i<10) {
			System.out.println("obj is alive");	
			i++;
			if(i>5) {
				try {
					obj.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		while(obj.isInterrupted()) {
			System.out.println("interrupted");
		}

	}
}
