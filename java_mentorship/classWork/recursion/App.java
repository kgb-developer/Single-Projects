public class App {
	public static void main(String[] args) {
		addToReallyBigNumer(1);
	}

	public static int addToReallyBigNumer(int num) {
		if(num != 1000) {
			System.out.println("Num = " + num);
			addToReallyBigNumer(num + 1);

		} else {
			System.out.println("Num is 1000!");
		}

		return num;
	}
}