package Seccion03.queue;

import java.util.ArrayList;
import java.util.List;

public class deque {
	private List<Integer> deque = new ArrayList<Integer>();

	public void insertFront(int item) {
		System.out.println("adding at front:" + item);
		deque.add(0, item);
		System.out.print(deque);

	}

	public void removeFront() {
		if (deque.isEmpty()) {
			System.out.println("Deque underflor !! unable to remove ");
			return;
		}
		int rem = deque.remove(0);
		System.out.println("remove from front" + rem);
		System.out.println(deque);
	}

	public void removeRear() {
		if (deque.isEmpty()) {
			System.out.println("Deque underflor unable to remove ");
			return;
		}
		int rem = deque.remove(deque.size() - 1);
		System.out.println("removed from front" + rem);
		System.out.println(deque);

	}

	public int peakFront() {
		int item = deque.get(0);
		System.out.println("Element at first" + item);
		return item;

	}

	public int peakRear() {
		int item = deque.get(deque.size() - 1);
		System.out.println("Element at rear" + item);
		return item;

	}

	public static void main(String a[]) {
		deque deq = new deque();
		deq.insertFront(34);
		deq.insertFront(50);
		deq.removeFront();
		deq.removeFront();
		deq.removeFront();
		deq.insertFront(21);
		deq.insertFront(98);
		deq.insertFront(50);
		deq.insertFront(43);
		deq.removeFront();
	}
}
