package classandobject;

// template of an object
public class Dog {

	int tail = 1;

	String color = "black";

	int eyes = 2;

	public Dog() {
		System.out.println("Normal Dog");
	}

	public Dog(String breed) {
		System.out.println("The Dog breed is=:" + breed);
	}

	public void bark() {
		System.out.println("Dog can bark");
	}

	public void eat() {
		System.out.println("The Dog can eat");
	}

	public void sleep() {
		System.out.println("The Dog can sleep");
	}

}
