package abstractdemo4;

public class Superimpl extends Car implements SuperCar, Racingcar {

	@Override
	public void speed() {
		System.out.println("Speed is 500 km/h");

	}

	@Override
	public void brand() {
		System.out.println("bmw");

	}

	@Override
	public void wheels() {
		System.out.println("Alloy wheels");

	}

	@Override
	public void torque() {
		System.out.println("5.5 mm");

	}

	@Override
	public void breaks() {
		System.out.println("Disc breaks");

	}

	@Override
	public void clutch() {
		System.out.println("Good clutch");

	}

}
