package asbtarctdemo;

public class Supercarimpl extends Car implements Supercar, Racingcar {

	@Override
	public void speed() {
		System.out.println("Super has speed of 500 km/h");

	}

	@Override
	public void airbag() {
		System.out.println("Super car has 4 airbag");

	}

	@Override
	public void tyres() {
		System.out.println("Racing car has tubeless tyre");

	}

	@Override
	public void tourque() {
		System.out.println("tourque is good");

	}

	@Override
	public void brakes() {
		System.out.println("Car has disc brakes");

	}

	@Override
	public void accelerator() {
		System.out.println("Car has good accelerator");

	}

	@Override
	public void clutch() {
		System.out.println("Clutch has good");

	}

}
