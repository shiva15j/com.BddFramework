package loopdemo1;

public class Demo5 {

	public static void main(String[] args) {

		int j, row = 5;

		for (int i = 0; i < row; i++) {
			for (j=row-i; j>1; j--) 
			{ 
			//To print space between two stars 
			System.out.print(" "); 
			} 

			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
