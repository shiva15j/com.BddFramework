package abstractdemo;

public class Superimpl extends Car implements Supercar, LuxuryCar {

	@Override
	public void speed() {
		System.out.println("The Supercar has speed of 500 km/h");

	}

	@Override
	public void brand() {
		System.out.println("Brand = bmw");

	}

	@Override
	public void color() {
		System.out.println("Red");

	}

	@Override
	public void minifridge() {
		System.out.println("This car has mini fridge");

	}

	@Override
	public void airbag() {
		System.out.println("This car has airbag");

	}

	@Override
	public void brakes() {
		System.out.println("This car brakes");

	}

	@Override
	public void clutch() {
		System.out.println("This car has smooth clutch");

	}

	@Override
	public void accelerator() {
		System.out.println("This car has smooth accelerator");

	}

}
