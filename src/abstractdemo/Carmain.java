package abstractdemo;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Carimpl();

		cc.accelerator();
		cc.brakes();
		cc.clutch();
		cc.price();

		System.out.println(" ");

		Supercar sc = new Superimpl();

		sc.brand();
		sc.color();
		sc.speed();

		System.out.println(" ");

		Superimpl sb = new Superimpl();
		sb.accelerator();
		sb.airbag();
		sb.brakes();
		sb.brand();
		sb.color();
		sb.minifridge();
		sb.speed();

	}

}
