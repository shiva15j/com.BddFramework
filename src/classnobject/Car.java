package classnobject;

public class Car {

	// Constructor

	// constructor name should be same as of the class name

	// constructor should not have to be any type

	// you dont need to call a constructor it is going to initialize itsself
	// automatically at the time of object creation

	// constructor have three types

	// Default :- Internally created by JVM at the time of object creation when no
	// other constructor is created in the class

	// Non Parameterized

	// Parameterized

	 String color = "black";

	String wheels = "alloy";

	//// Non Parameterized
	public Car() {
		System.out.println("I am a Car Constructor");
	}

	// Parameterized
	public Car(String brand) {
		System.out.println("Brand of the Car=:" + brand);
	}

	public void run() {
		System.out.println("This car can run!!!!!!!");
	}

	public void horn() {
		System.out.println("This car can make horn");
	}

}
