package loopdemo1;

public class Demo3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {// i=6

			for (int j = 1; j <= i; j++) { //j =6
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
