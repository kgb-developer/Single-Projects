public abstract class AbstractClass {
	// Protected - Only used when extending Vehicle class
	protected int numWheel; 
	protected boolean convertible;
	protected String color;
	protected String brand;

	// Declaring abstract methods
	abstract int getNumWheels();
	abstract boolean getConvertible(boolean convertible);
	abstract String getColor(String color);
	abstract String getBrand(String brand);
}