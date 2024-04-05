package loopdemo2;

public class LargestElement {

	public static void main(String[] args) {

		int arr[] = { 10, 90, 70, 40, 50 };

		int largest = arr[0];

		for (int num : arr) {

			if (largest < num) {
				largest = num;
			}
			System.out.println("The largest=:" + largest);

		}

	}

}
