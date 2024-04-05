package methodemo;

public class Shape {

	// methods

	public static void rectangle(int l, int b) {

		int area = l * b;

		System.out.println("The area of the rectngle is=:" + area);

	}

	public static void Sqaure(int side) {
		int area = side * side;

		System.out.println("The area of the sqaure is=:" + area);

	}

	public static void main(String[] args) {

		Sqaure(12);

		rectangle(10, 20);

	}

}
