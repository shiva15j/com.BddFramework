package abstractdemo4;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Carimpl();

		cc.price();
		cc.breaks();
		cc.clutch();

		System.out.println(" ");

		SuperCar sc = new Superimpl();
		sc.speed();
		sc.brand();

		System.out.println(" ");

		Superimpl sm = new Superimpl();
		sm.brand();
		sm.speed();
		sm.wheels();
		sm.torque();
		sm.breaks();
		sm.clutch();
	}

}
