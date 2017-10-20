import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double weight;
		int planet;

		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextDouble();

		System.out.println("I have information for the following planets:");
		System.out.println("\t1. Venus 2. Mars 3. Jupiter");
		System.out.println("\t4. Saturn 5. Uranus 6. Neptune");

		System.out.println("Which planet are you visiting? ");
		planet = keyboard.nextInt();

		if(planet == 1) {
			System.out.println("You're weight would be " + weight * 0.78 + " on that planet.");
		}

		if(planet == 2) {
			System.out.println("You're weight would be " + weight * 0.39 + " on that planet.");
		}

		if(planet == 3) {
			System.out.println("You're weight would be " + weight * 2.65 + " on that planet.");
		}

		if(planet == 4) {
			System.out.println("You're weight would be " + weight * 1.17 + " on that planet.");
		}

		if(planet == 5) {
			System.out.println("You're weight would be " + weight * 1.05 + " on that planet.");
		}

		if(planet == 6) {
			System.out.println("You're weight would be " + weight * 1.23 + " on that planet.");
		}
	}
}