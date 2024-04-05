package methoddemo;

import java.util.Scanner;

public class Shape {

	public static void rectangle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Length=:");

		int length = sc.nextInt();

		System.out.println("Breadth=:");

		int breadth = sc.nextInt();

		int area = length * breadth;

		System.out.println("The area of the rectangle is=:" + area);

	}

	public static void Sqaure() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Side=:");

		int side = sc.nextInt();

		int area = side * side;

		System.out.println("The area of the sqaure is=:" + area);

	}

	public static void main(String[] args) {
		Sqaure();
		rectangle();

	}

}
