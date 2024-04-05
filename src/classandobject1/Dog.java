package classandobject1;

public class Dog {

	// Constructor:-

	// 1:- The name should be same as of the class name.

	// 2:- It should not have any return type

	// 3:- It will have three types
	// Default Constructor
	// Non Parameterized Constructors
	// Parameterized Constructors

	// 4:- A constructor should not be called it is going to initialize itself
	// automatically at the time of object creation

	public Dog() {
		System.out.println("I am a Dog Constructor");
	}
	
	public Dog(String breed) {
		System.out.println("The Breed Of the Dog is=:"+breed);
	}

	int tail = 1;

	int eyes = 2;

	String color = "brown";

	public void bark() {
		System.out.println("The dog can bark");
	}

	public void sleep() {
		System.out.println("The dog can sleep");
	}

	public void eat() {
		System.out.println("The dog can eat");
	}

}
