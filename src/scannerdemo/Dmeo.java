package scannerdemo;

import java.util.Scanner;

public class Dmeo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("num=:");
		int num = sc.nextInt();

		System.out.println("num1=:");
		int num1 = sc.nextInt();

		int sum = num + num1;

		System.out.println("Sum=:" + sum);

		int sub = num - num1;

		System.out.println("Sub=:" + sub);
	}

}
