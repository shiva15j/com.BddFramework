package loopdemo2;

public class Fact {

	public static void main(String[] args) {

		int fact = 1;

		int num = 5;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			// fact = 1*1=1
			// fact = 1*2=2
			// fact = 2*3=6
			System.out.println("Fact =:" + fact);

		}
		//System.out.println("Fact =:" + fact);

	}

}
