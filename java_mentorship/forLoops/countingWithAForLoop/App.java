import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Type in a message, and i'll display it five times.");
		System.out.print("Message: ");
		String message = keyboard.nextLine();

		for(int n = 1; n <= 8; n = n + 1) {
			System.out.println(n + ". " + message);
		}
	}
}