import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;

		String message_one = "You can't drive.";
		String message_two = "You can't vote.";
		String message_three = "You can't rent a car";
		String message_four = "You can do anything that's legal.";

		System.out.print("Hey, what's your name?");
		name = keyboard.next();

		System.out.print("Ok, " + name + ", how old are you?");
		age = keyboard.nextInt();

		if(age < 16) {
			System.out.println(message_one);
		}

		if(age < 18) {
			System.out.println(message_two);
		}

		if(age < 25) {
			System.out.println(message_three);
		}

		if(age <=25) {
			System.out.println(message_four);
		}
	}
}