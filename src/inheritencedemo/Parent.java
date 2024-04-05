package inheritencedemo;


//You can not inherit a final class
final public class Parent {

	// Variable value can not be changed
	final String food = "khichdi";

	public void eat() {
		// food = "Pizza";

		System.out.println("Parent can eat=:" + food);
	}

	//You can not override a final method
	final public void sleep() {
		System.out.println("Parent can sleep");
	}

}
