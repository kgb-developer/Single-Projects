import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Student[] students = new Student[] {
			new Student("Kristi", "Good"),
			new Student("Charles", "Cantoni")
		};

		for(Student s : students) {
			s.printFullName();
		}
	}
}

class Student {
	private String firstName;
	private String lastName;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void printFullName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
}