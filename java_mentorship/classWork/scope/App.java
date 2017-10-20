class App {
	static String test = "class";

	public static void main(String[] args) {
		System.out.println("Scope is: " + test);
		
		scope();
		System.out.println("Scope is: " + test);

		do {
			String test = "loop";
			System.out.println("Scope is: " + test);

		} while(false);

		System.out.println("Scope is: " + test);
	}

	public static void scope() {
		String test = "method";
		System.out.println("Scope is: " + test);
	}
}