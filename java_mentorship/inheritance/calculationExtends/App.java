class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers is: " + z);
	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers is: " + z);
	}
}

public class App extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers is: " + z);
	}

	public static void main(String args[]) {
		int a = 20;
		int b = 10;

		App demo = new App();

		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
	}
}