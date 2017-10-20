import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Count to: ");
		int input = keyboard.nextInt();

		for(int count = 1; count <= input; count++) {
			System.out.print(count + " ");
		}
	}
}