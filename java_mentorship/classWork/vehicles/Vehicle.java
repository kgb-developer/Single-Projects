public class Vehicle extends AbstractClass {
	public Vehicle() {
		numWheel = 4;
	}

	public int getNumWheels() {
		return numWheel;
	}

	public boolean getConvertible(boolean convertible) {
		this.convertible = convertible;
		return convertible;
	}

	public String getColor(String color) {
		this.color = color;
		return color;
	}

	public String getBrand(String brand) {
		this.brand = brand;
		return brand;
	}
}