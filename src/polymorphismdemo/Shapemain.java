package polymorphismdemo;

public class Shapemain {

	public static void main(String[] args) {

		Shape sp = new Shape();

		sp.area();
		sp.area(10.2f);
		sp.area(10);
		sp.area(10, 20);

	}

}
