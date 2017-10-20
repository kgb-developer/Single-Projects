import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;

public class App {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in); // Reads to file
		String[] networks = {"ESPN", "ESPNW", "ESPN2", "ESPN Deportes", "Longhorn", "ESPN Classic", "ESPNU", "SEC"};

		try {
			PrintWriter myWriter = new PrintWriter("file", "UTF-8"); // Prints to file
			for(int i = 0; i < networks.length; i++) {
				System.out.println("Writing to file: " + networks[i]);
				myWriter.println(networks[i]);
			}
			
			myWriter.close();

		} catch (FileNotFoundException exceptionOne) {
			System.out.println("Shit hit the fan!");
			System.exit(1);

		} catch (UnsupportedEncodingException exceptionTwo) {
			System.out.println("Shit hit the fan!");
			System.exit(1);
		}
	}
}