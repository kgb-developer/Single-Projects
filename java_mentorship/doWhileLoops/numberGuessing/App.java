import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		int guess;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("\n");

		do {
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			count++;

			if(guess == 6) {
				System.out.println("That's right! You're a good guesser.");
			} else {
				System.out.println("That is incorrect. Guess again.");
			}

		} while(count < 4);
	}
}