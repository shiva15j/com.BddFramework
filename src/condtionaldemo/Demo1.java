package condtionaldemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("Num=:");
//
//		int num = sc.nextInt();
//
//		System.out.println("Num1=:");
//
//		int num1 = sc.nextInt();

//		boolean cond = num == num1;
//		
//		System.out.println(cond);

		// System.out.println(num == num1);

		System.out.println("name=:");

		String name = sc.next();

		System.out.println("name1=:");

		String name1 = sc.next();

		System.out.println(name.equals(name1));

	}

}
