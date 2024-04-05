package condtiondemo;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");

		String username = sc.next();

		System.out.println("Pin=:");
		int pin = sc.nextInt();

		if (username.equals("Shivam") && pin == 1234) {
			System.out.println("Welcome to Home Page!!!");
		}
		else if (username.equals("Suyash") && pin == 1634) {
			System.out.println("Welcome to Home Page!!!");
		}
		else if (username.equals("Nupur") && pin == 6789) {
			System.out.println("Welcome to Home Page!!!");
		}
		else if (username.equals("Rupesh") && pin == 7890) {
			System.out.println("Welcome to Home Page!!!");
		}
		else if (username.equals("Saurabh") && pin == 7890) {
			System.out.println("Welcome to Home Page!!!");
		}

		else {
			System.err.println("Invalid Credentials");
		}

	}

}
