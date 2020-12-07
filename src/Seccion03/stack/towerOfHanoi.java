package Seccion03.stack;

public class towerOfHanoi {
	private static dynamicStack[] tower;

	public static void towerofhenoi(int n) {
		tower = new dynamicStack[4];
		for (int i = 0; i <= 3; i++) {
			tower[i] = new dynamicStack(4);
		}
		for (int d = n; d > 0; d--) {
			tower[1].push(new Integer(d));
		}
		showTowerStates(n, 1, 2, 3);
	}

	public static void showTowerStates(int n, int x, int y, int z) {
		if (n > 0) {
			try {
				showTowerStates(n - 1, x, y, z);
				Integer d = (Integer) tower[x].pop();
				tower[y].push(d);
				System.out.println("Move Disk " + d + "form tower " + x + "to top of tower" + y);
				showTowerStates(n - 1, z, y, x);

			} catch (Exception ex) {
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Running 3 disk Problem");
		towerofhenoi(3);
	}

}
