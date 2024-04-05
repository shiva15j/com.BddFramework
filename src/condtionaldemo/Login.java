package condtionaldemo;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");

		String username = sc.next();

		System.out.println("Pin=:");

		int pin = sc.nextInt();

		if (username.equals("Akash") && pin == 1234) {
			System.out.println("Welcome to the home page!!!!");
		} else if (username.equals("Shivam") && pin == 1234) {
			System.out.println("Welcome to the home page!!!!");
		} else if (username.equals("Priyanka") && pin == 45678) {
			System.out.println("Welcome to the home page!!!!");
		}
		else {
			System.err.println("Invalid Credentials!!!!");
		}

	}

}
