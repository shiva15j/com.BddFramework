package loopdemo1;

public class Demo2 {

	public static void main(String[] args) {

		// Nested for loop

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
