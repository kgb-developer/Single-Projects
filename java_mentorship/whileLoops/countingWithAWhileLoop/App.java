import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Type in a message, and i'll display it five times.");
		System.out.print("Message: ");
		String message = keyboard.nextLine();

		int count = 0;

		while (count < 5) {
			System.out.println((count + 1) + ". " + message);
			count++;
		}
	}
}