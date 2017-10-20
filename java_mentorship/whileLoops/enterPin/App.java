import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("Welcome to the bank of Good!");
		System.out.print("Enter your pin: ");
		int entry = keyboard.nextInt();

		while (entry != pin) {
			System.out.println("\n Incorrect pin. Try again.");
			System.out.print("Enter your pin: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\n Pin accepted. You now have access to your account!");
	}
}