import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;

		System.out.println("Welcome to the bank of Good!");
		System.out.print("Enter your pin: ");

		int entry = keyboard.nextInt();
		tries++;

		while (entry != pin && tries < 3) {
			System.out.println("\nIncorrect pin. Try again.");
			System.out.print("Enter your pin: ");

			entry = keyboard.nextInt();
			tries ++;
		}

		if(entry == pin) {
			System.out.println("\nPin accepted. You now have access to your account.");

		} else if(tries >= 3) {
			System.out.println("\nYou have run out of tries. Account locked.");
		}
	}
}