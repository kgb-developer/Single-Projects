import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Here come the dice!");
		System.out.print("\n");

		int count = 0;

		do {
			System.out.print("Roll #1: ");
			int entryOne = keyboard.nextInt();

			System.out.print("Roll #2: ");
			int entryTwo = keyboard.nextInt();

			System.out.println("The total is " + (entryOne + entryTwo));
			System.out.print("\n");
			count++;
		} while(count < 4);
	}
}