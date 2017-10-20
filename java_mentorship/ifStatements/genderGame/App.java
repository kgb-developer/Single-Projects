import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String gender;
		String firstName;
		String lastName;
		String married;
		int age;

		System.out.print("What is your gender (M or F)? ");
		gender = keyboard.next();

		System.out.print("First name: ");
		firstName = keyboard.next();

		System.out.print("Last name: ");
		lastName = keyboard.next();

		System.out.print("Age: ");
		age = keyboard.nextInt();

		if(gender.equals("F") && age >= 20) {
			System.out.print("Are you married, " + firstName + " (Y or N)? ");
			married = keyboard.next();

			if(married.equals("Y")) {
				System.out.println("Then I shall call you Mrs. " + lastName);
			} else {
				System.out.println("Then I shall call you " + firstName + " " + lastName);
			}

		} else if(gender.equals("M") && age >= 20) {
			System.out.println("Then I shall call you Mr. " + lastName);

		} else {
			System.out.println("Then I shall call you " + firstName + " " + lastName);
		}
	}
}