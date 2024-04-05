package loopdemo;

public class Fact {

	public static void main(String[] args) {

		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
			// fact =1*1=1
			// fact=1*2=2
			// fact=2*3=6
			// fact=6*4=24
			// fact24*5=120

		}
		System.out.println("Fact=:" + fact);

	}

}
