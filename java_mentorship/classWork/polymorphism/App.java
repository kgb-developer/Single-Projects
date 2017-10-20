class App {
	public static void main(String[] args) {
		 //Animal object that contains all methods from Aninmal class and any overridden method in Dog
		//Upcasting an instance of Dog to the Animal object
		Animal myAnimal = new Dog();
		Dog myDog = new Dog();

		System.out.println("Calling moveType method from myAnimal: " + myAnimal.move("running"));
		System.out.println("Calling moveType method from myDog: " + myDog.move("walking"));

		myAnimal.sleep(10);
		myAnimal.setNumPaws(4);

		System.out.println("numPaws: " + myAnimal.getNumPaws());
		System.out.println("Has tail? " + myAnimal.tail);
	}
}

class Animal {
	private int numPaws;
	public boolean tail = false;

	public void eat(String foodType) {
		System.out.println("Eating: " + foodType);
	}

	public void sleep(int sleepHours) {
		System.out.println("Sleeping for: " + sleepHours + " hrs.");
	}

	public String move(String moveType) {
		System.out.println("Moving: " + moveType);
		return moveType;
	}

	public int getNumPaws() {
		return numPaws;
	}

	public void setNumPaws(int numPaws) {
		this.numPaws = numPaws;
	}
}

class Dog extends Animal {
	public boolean tail = true;

	public void bark() {
		System.out.println("BARRRKING!!!");
	}

	public void sleep(int sleepHours) {
		System.out.println("Overriding sleep method."); //Upcasting
	}
}