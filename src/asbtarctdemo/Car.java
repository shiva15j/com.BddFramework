package asbtarctdemo;

public abstract class Car {

	// if your class will have am abstract method then your class should have to be
	// abstract as well

	// You can not create object of a Abstract class

	public abstract void brakes();

	public abstract void accelerator();

	public abstract void clutch();

	public void price() {
		System.out.println("The Price= 6000000");
	}

}
