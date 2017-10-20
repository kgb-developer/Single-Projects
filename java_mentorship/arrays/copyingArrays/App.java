import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] firstArray = {45, 87, 39, 32, 93, 86, 12, 44, 75, 50};
		int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);

		firstArray[9] = -7;

		System.out.print("Array 1: ");
		System.out.print(Arrays.toString(firstArray));

		System.out.println(" ");

		System.out.print("Array 2: ");
		System.out.print(Arrays.toString(secondArray));
	}
}