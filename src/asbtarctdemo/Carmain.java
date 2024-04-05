package asbtarctdemo;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Carimpl();

		cc.accelerator();
		cc.brakes();
		cc.clutch();
		cc.price();

		System.out.println(" ");

		Supercar sc = new Supercarimpl();
		sc.speed();
		sc.airbag();

		System.out.println(" ");

		Supercarimpl sd = new Supercarimpl();
		sd.accelerator();
		sd.brakes();
		sd.clutch();
		sd.price();
		sd.airbag();
		sd.speed();
		sd.tyres();
		sd.tourque();

	}

}
