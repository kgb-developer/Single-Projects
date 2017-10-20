import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String quizReady;
		int answer;
		int correct = 0;

		int questionOneAnswerOne = 1;
		int questionOneAnswerTwo = 2;
		int questionOneAnswerThree = 3;

		int questionTwoAnswerOne = 1;
		int questionTwoAnswerTwo = 2;

		int questionThreeAnswerOne = 1;
		int questionThreeAnswerTwo = 2;
		int questionThreeAnswerThree = 3;


		System.out.print("Are you ready for a quiz?! ");
		quizReady = keyboard.next();
		System.out.println("Ok, here it comes!");

		System.out.println("");
		System.out.println("Q1. What is the capital of Alaska? ");
		System.out.println("1) Melborne  2) Anchorage  3) Juneau ");
		answer = keyboard.nextInt();

		if(answer == 1) {
			System.out.println("Incorrect");

		} else if(answer == 2) {
			System.out.println("Incorrect");
			
		} else if(answer == 3) {
			System.out.println("That's right!");
			correct++;
		}

		System.out.println("");
		System.out.println("Q2. Can you store the value 'cat' in a variable of type int? ");
		System.out.println("1) Yes  2) No ");
		answer = keyboard.nextInt();

		if(answer == 1) {
			System.out.println("Sorry, 'cat' is a string. ints can only store numbers");

		} else if(answer == 2) {
			System.out.println("That's right!");
			correct++;
			
		}

		System.out.println("");
		System.out.println("Q3. What is the result of 9+6/3? ");
		System.out.println("1) 5  2) 11  3) 15/3 ");
		answer = keyboard.nextInt();

		if(answer == 1) {
			System.out.println("Incorrect");

		} else if(answer == 2) {
			System.out.println("That's right!");
			correct++;
			
		} else if(answer == 3) {
			System.out.println("Incorrect");
		}

		System.out.println("");
		System.out.println("Overall, you got "+ correct +" out of 3 correct.");
		System.out.println("Thanks for playing!");
	}
}