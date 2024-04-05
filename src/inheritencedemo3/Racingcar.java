package inheritencedemo3;

public class Racingcar extends Car {

	public void run() {
		System.out.println("Racing car can run");
	}

	public void speed() {
		System.out.println("Racing car have speed");
	}

	public void wheels() {
		System.out.println("Racing car has wheels");
	}

	public void display() {
		this.wheels(); // this :- local reference
		super.wheels();// super :- global reference
	}

}
