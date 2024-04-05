package methodemo1;

public class Shape {

	public static void rectangle(int l, int b) {
		int area = l * b;

		System.out.println("The area of the rectangle is=:" + area);

	}

	public static void sqaure(int side) {

		int area = side * side;

		System.out.println("The area of the sqaure is=:" + area);
	}

	public static void circle(float r) {

		double area = 3.14 * r * r;

		System.out.println("The area of the circle is=:" + area);

	}

	public static void main(String[] args) {

		circle(7.2f);

		sqaure(12);

		rectangle(10, 20);
	}

}
