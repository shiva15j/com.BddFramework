package arraydemo12;

public class Demo {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		// length=4
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		// iterator
//		for (int i = 0; i < 9; i++) {
//			System.out.println(arr[i]);
//		}

		// for each

		for (int vl : arr) {
			System.out.println(vl);
		}

	}
}
