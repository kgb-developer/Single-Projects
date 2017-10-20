public class G63 extends Vehicle {
	private String[] extensionList = {"Performance Package", "mbrace Concierge", "Leather Package"}; // Create private String only to be used within G63 class

	public G63() {
		numWheel = 6;
	}

	public String getExtensionsSelection(int extensionNum) {
		return extensionList[extensionNum]; // Choose string in extensionList by array index in main method
	}
}