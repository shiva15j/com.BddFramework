package keywoarddemo;

public class Laptop extends Computer {

	public void ram() {
		System.out.println("The Laptop has 16 gb ram");
	}

	public void storage() {
		System.out.println("The Laptop has storage of 1 tb");
	}

	public void display() {
		this.storage(); // Local reference
		super.storage(); // Parent reference
	}

}
