import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Type a message!");
		System.out.print("Message: ");
		String message = keyboard.nextLine();

		for(int count=1; count<=10; count = count+1) {
			System.out.println(count + ". " + message);
		}
	}
}