package classnobject;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Car("audi");

		cc.run();

		cc.horn();
		
		cc.color="red";

		System.out.println(cc.color);

		System.out.println(cc.wheels);

		System.out.println(" ");

		Car ct = new Car("bmw");
		ct.run();
		ct.horn();

	}

}
