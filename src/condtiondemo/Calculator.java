package condtiondemo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Arthematic Operator=:");
		String opr = sc.next();

		System.out.println("Num1=:");
		int Num1 = sc.nextInt();

		System.out.println("Num2=:");
		int Num2 = sc.nextInt();

		switch (opr) {
		case "+":
			System.out.println("Sum=:");
			System.out.println(Num1 + Num2);
			break;
		case "-":
			System.out.println(" ");
			System.out.println("Sub=:");
			System.out.println(Num1 - Num2);
			break;
		case "*":
			System.out.println(" ");
			System.out.println("Mul=:");
			System.out.println(Num1 * Num2);
			break;
		case "/":
			System.out.println(" ");
			System.out.println("Div=:");
			System.out.println(Num1 / Num2);
			break;
		case "%":
			System.out.println(" ");
			System.out.println("Mod=:");
			System.out.println(Num1 % Num2);
			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
