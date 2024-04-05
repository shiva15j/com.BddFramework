package abstractdemo;

public class Carimpl extends Car {

	@Override
	public void brakes() {
		System.out.println("The Car has disc brakes");

	}

	@Override
	public void clutch() {
		System.out.println("The Car has smooth clutch");

	}

	@Override
	public void accelerator() {
		System.out.println("The  Car has smooth accelrator");

	}

}
