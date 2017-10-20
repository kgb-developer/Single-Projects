import java.util.*;

class App {

	public static void main(String[] args) { 
		Stack guitars = new Stack();

		guitars.push("acoustic");
		guitars.push("stratocaster");
		guitars.push("telecaster");
		guitars.push("double neck");

		//System.out.println("I have this many guitars: " + guitars.size());

		//Iterator itr = guitars.iterator();

		while(!(guitars.empty())) {
			String guitar = (String) guitars.pop();
			System.out.println("My selected guitar is: " + guitar);
		}
	}
} 