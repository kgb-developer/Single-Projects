class App {
	public static void main(String[] args) {
		Calculator test = new Calculator();

		int sum = test.Add(4, 1);

		System.out.println(sum);
	}
}

class Calculator {
	Boolean isOn;

	public Calculator() {
		System.out.println("In calculator constructor!");
		isOn = true;
	}

	public int Add(int numOne, int numTwo) {
		int sum = numOne + numTwo;
		return sum;
	}
}