package classandobject1;

public class Dogmain {

	public static void main(String[] args) {

		Dog dfg;
		dfg = new Dog();

		dfg.eat();
		dfg.bark();
		dfg.sleep();

		System.out.println(dfg.tail);

		System.out.println(dfg.color);

		System.out.println(dfg.eyes);

		System.out.println(" ");

		dfg = new Dog("German Shefrad");
		dfg.eat();
		dfg.bark();
		dfg.sleep();

		System.out.println(dfg.tail);

		System.out.println(dfg.color);

		System.out.println(dfg.eyes);

	}

}
