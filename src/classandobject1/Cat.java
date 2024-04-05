package classandobject1;

public class Cat {

	int tail = 1;

	String color = "brown";

	int eyes = 2;

	public Cat() {
		System.out.println("This is Cat constructor");
	}

	public Cat(String bread) {
		System.out.println("Car of breed=:" + bread);
	}

	public void walk() {
		System.out.println("cat can walk");
	}

	public void run() {
		System.out.println("cat can run");
	}

	public void eat() {
		System.out.println("cat can eat");
	}

	public void sleep() {
		System.out.println("cat can sleep");
	}

}
