package day2;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");
		int age = sc.nextInt(); // age =

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can not vote");
		}

	}

}
