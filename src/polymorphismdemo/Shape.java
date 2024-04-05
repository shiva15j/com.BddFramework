package polymorphismdemo;

public class Shape {
	
	int area;

	public void area() {
		System.out.println("Going to find area of diffrent shapes");
	}

	public void area(int l, int b) {
		int area = l * b;
		System.out.println("The area of the rectangle is=:" + area);
	}

	public void area(int side) {

		int area = side * side;
		System.out.println("The area of the sqaure is=:" + area);

	}

	public void area(float r) {

		double area = 3.14 * r * r;

		System.out.println("The area of the circle is=:" + area);

	}

}
