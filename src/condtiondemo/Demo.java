package condtiondemo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("name1=:");
//		String name1 = sc.next();
//
//		System.out.println("name2=:");
//		String name2 = sc.next();

		// boolean cond = name1.equals(name2);

//		System.out.println(name1.equals(name2));

		System.out.println("value1=:");
		int value1 = sc.nextInt();

		System.out.println("value2=:");
		int value2 = sc.nextInt();

		System.out.println(value1 == value2);

	}

}
