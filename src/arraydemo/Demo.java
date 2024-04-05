package arraydemo;

public class Demo {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		boolean cond[] = { true, false, true, true };

		// Length=5

		// index=length-1

//		System.out.println(arr[0]);
//		
//		System.out.println(arr[4]);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int vl : arr) {
			System.out.println(vl);
		}

//		for (boolean cd : cond) {
//			System.out.println(cd);
//		}

	}

}
