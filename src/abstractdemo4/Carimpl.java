package abstractdemo4;

public class Carimpl extends Car {

	@Override
	public void breaks() {
		System.out.println("Car has disc break");
		
	}

	@Override
	public void clutch() {
		System.out.println("Car has good clutch");
		
	}

}
