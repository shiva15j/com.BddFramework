package loopdemo;

public class Demo1 {

	public static void main(String[] args) {

		// 10:=1+2+3+4+5+6+7+8+9+10

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum = sum + i;
			// sum=0+1=1
			// sum=1+2=3
			// sum=3+3=6
			// sum=6+4=10
			// sum=10+5=15
			// sum=15+6=21
		}
		System.out.println("Sum=:" + sum);

	}

}
