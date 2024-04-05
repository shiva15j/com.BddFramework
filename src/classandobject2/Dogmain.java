package classandobject2;

public class Dogmain {

	public static void main(String[] args) {

		Dog dh = new Dog();

		dh.eat();
		dh.sleep();
		dh.run();

		System.out.println("The Dog color =:" + dh.color);
		System.out.println("Tail of the Dog =:" + dh.tail);

		System.out.println(" ");

		Dog dg = new Dog("rotwillor");

		dg.eat();
		dg.sleep();
		dg.run();

		System.out.println(dg.color);
		System.out.println(dg.tail);

	}

}
