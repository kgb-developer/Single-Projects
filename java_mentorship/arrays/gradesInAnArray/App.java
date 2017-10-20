import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Name (First, Last): ");
		String name = keyboard.nextLine();

		System.out.println(" ");

		System.out.print("Filename: ");
		String filename = keyboard.nextLine();

		System.out.println(" ");

		double[] myArray;
		myArray = new double[10];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = randomFill();
		}

		System.out.println("Here are you randomly-selected grades (hope you pass): ");

		System.out.println(myArray);
	}	
}