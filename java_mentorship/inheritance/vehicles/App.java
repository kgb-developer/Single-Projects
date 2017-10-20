class App {
	public static void main(String[] args) {
		Bicycle superAwesomeMountainBike = new Bicycle();
		superAwesomeMountainBike.accelerate();

		System.out.println("My super awesome mountain bike has: " + superAwesomeMountainBike.getWheels() + " wheels.");

		//Ferrari fastCar = new Ferrari();
		//fastCar.gassit();
		//fastCar.steer("right");
		//fastCar.decelerate();

		//System.out.println("My supremely fast car has: " + fastCar.getWheels() + " wheels.");
	}
}

class Vehicle {
	protected int numWheels;

	public Vehicle() {
		numWheels = 4;
	}

	public void steer(String direction) {
		System.out.println("Steering: " +  direction);
	}

	public void accelerate() {
		System.out.println("Speeding up");
	}

	public void decelerate() {
		System.out.println("Slowing down");
	}

	public int getWheels() {
		return numWheels;
	}
}

class Bicycle extends Vehicle {
	protected int numWheels; // Recreating this again in the child class (bicycle) hides numWheels in the parent class

	public Bicycle() {
		numWheels = 2;
	}

	public void accelerate() {
		System.out.println("Pedaling bicycle faster");
		super.accelerate();
	}
}

class Ferrari extends Vehicle {
	public Ferrari() {
		super(); //calls constructor of vehicle - sets numWheels to 4
	}

	public void gassit() {
		System.out.println("Putting the pedal to the metal!");
		accelerate();
	}
}