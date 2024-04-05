package keywoarddemo;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Car();

		cc.speed();
		cc.sunroof();

		System.out.println(" ");

		Supercar sc = new Supercar();
		sc.speed();
		sc.brakes();

		System.out.println(" ");
		System.out.println("This&Super=:");
		System.out.println(" ");

		sc.display();
	}

}
