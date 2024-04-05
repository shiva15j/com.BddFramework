package condtionaldemo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// rectangle :-

		System.out.println("Length=:");
		int a = sc.nextInt();

		System.out.println("breadth=:");
		int b = sc.nextInt();

		int area = a * b;

		System.out.println("The area of the rectangle is=:" + area);

	}

}
