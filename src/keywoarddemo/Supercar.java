package keywoarddemo;

public class Supercar extends Car {

	public void speed() {
		System.out.println("Super car speed is =600 km/h");
	}

	public void brakes() {
		System.out.println("Super has disc brakes");
	}

	public void display() {
		this.speed(); // local reference
		super.speed(); // parent reference
	}

}
