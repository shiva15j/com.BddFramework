package classandobject2;

public class Dog {

	// Constructor

	// Constructor name should be same as of the class name
	// Constructor do not have any type
	// You don't need to call a constructor it initializes automatically at the time
	// of object creation
	// Constructor types:-
	// Default , Non Parameterized , Parameterized

	public Dog() {
		System.out.println("I am a Dog Constructor");
	}

	public Dog(String breed) {
		System.out.println("The dog breed=:" + breed);
	}

	String color = "white";

	int tail = 1;

	public void eat() {
		System.out.println("The dog can eat");
	}

	public void sleep() {
		System.out.println("The dog can sleep");
	}

	public void run() {
		System.out.println("The Dog can run");
	}

}
