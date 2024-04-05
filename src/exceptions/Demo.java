package exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		try {
			int div = num / num1;

			System.out.println("The Division=:" + div);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Compilation Continues..........");

	}

}
