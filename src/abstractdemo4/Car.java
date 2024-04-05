package abstractdemo4;

public abstract class Car {

	// Non Abstract Method : a method with definition

	public void price() {
		System.out.println("The price of the car is = 900000");
	}

	// abstract method: method without definition

	public abstract void breaks();

	public abstract void clutch();

}
