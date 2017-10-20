import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String swimmer1 = "Kristi";
		String swimmer2 = "Charlie";
		double minTemp = 79.0;
		double curTemp;
		double savedTemp;
		int swimTime;

		System.out.print("What is the current water temp? ");
		curTemp = keyboard.nextDouble();
		savedTemp = curTemp; // saves copy of value to get it back later

		System.out.println("\nThe current water temp is " + curTemp + " F.");
		System.out.println(swimmer1 + " approaches the lake...");

		swimTime = 0;

		while(curTemp >= minTemp) {
			System.out.print("\t" + swimmer1 + " swims for a bit ");
			swimTime++;
			System.out.println(" Swim time: " + swimTime + " min. ");
			//Thread.sleep(600); // pauses for 600 milliseconds
			curTemp -= 0.5; // subtracts 1/2 a degree from the water temp
			System.out.println("\tThe current water temp is now " + curTemp + " F. ");
		}

		System.out.println(swimmer1 + " stops swimming. Total swim time: " + swimTime + " min. ");
		curTemp = savedTemp; // restores original water temp
		System.out.println("\nCurrent water temp is: " + curTemp + " F. ");
		System.out.println(swimmer2 + " approaches the lake... ");

		swimTime = 0;

		do{
			System.out.print("\t" + swimmer2 + " swims for a bit ");
			swimTime++;
			System.out.println(" Swim time: " + swimTime + " min." );
			//Thread.sleep(600); // pauses for 600 milliseconds
			curTemp -= 0.5; // subtracts 1/2 a degree from the water temp
			System.out.println("\tThe current water temp is now " + curTemp + " F. ");

		} while(curTemp >= minTemp);

		System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime + " min. ");
	}
}