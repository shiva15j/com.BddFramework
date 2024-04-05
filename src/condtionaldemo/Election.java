package condtionaldemo;

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.err.println("Invalid age");
		}

	}

}
