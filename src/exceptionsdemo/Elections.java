package exceptionsdemo;

import java.util.Scanner;



public class Elections {
	
	public static void vote() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Age=:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Vote");
		}
		else {
			throw new Exception("Invalid Age");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	


}