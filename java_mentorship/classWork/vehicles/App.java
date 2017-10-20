public class App {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("Project Information:");
		System.out.println("\t - AbstractClass is being extended into Vehicle class; Contains abstract methods and private variables;");
		System.out.println("\t   Implimentation of methods are determined by child classes;");
		System.out.println("\t - Corvette method is using 'super()'. Calls parent constructor and automatically sets var numWheel to 4;");
		System.out.println("\t - getExtensionsSelection method is returning a private string which is only used inside the G63 class,");
		System.out.println("\t   Value of array is determined by user input when method is called on a G63 object;");
		System.out.println("\t   G63 constructor is overriding var numWheel;");

		// Objects; Instantiate classes
		Vehicle myVehicle = new Vehicle();
		Corvette myCorvette = new Corvette();
		G63 myG63 = new G63();

		// Print out information
		System.out.println(" ");
		System.out.println("About myVehicle Method:");
		System.out.println("\t Number of Wheels: " + myVehicle.getNumWheels());
		System.out.println("\t Convertible: " + myVehicle.getConvertible(false));
		System.out.println("\t Color: " + myVehicle.getColor("Default"));
		System.out.println("\t Brand: " + myVehicle.getBrand("Default"));

		System.out.println(" ");
		System.out.println("About myCorvette Method:");
		System.out.println("\t Number of Wheels: " + myCorvette.getNumWheels());
		System.out.println("\t Convertible: " + myCorvette.getConvertible(true));
		System.out.println("\t Color: " + myCorvette.getColor("blue"));
		System.out.println("\t Brand: " + myCorvette.getBrand("Chevrolet"));

		System.out.println(" ");
		System.out.println("About myG63 Method:");
		System.out.println("\t Number of Wheels: " + myG63.getNumWheels());
		System.out.println("\t Convertible: " + myG63.getConvertible(false));
		System.out.println("\t Color: " + myG63.getColor("black"));
		System.out.println("\t Brand: " + myG63.getBrand("Mercedes"));
		System.out.println("\t Extension Selection: " + myG63.getExtensionsSelection(2));
		System.out.println(" ");
	}
}