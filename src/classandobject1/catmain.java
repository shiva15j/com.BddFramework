package classandobject1;

public class catmain {

	public static void main(String[] args) {

		Cat cc = new Cat();

		cc.walk();
		cc.run();
		cc.eat();
		cc.sleep();
		System.out.println(cc.color);
		System.out.println(cc.tail);
		System.out.println(cc.eyes);

		System.out.println(" ");

		Cat cd = new Cat("Ragdoll");

		cd.walk();
		cd.eat();
		cd.run();
		cd.sleep();
		System.out.println(cd.color);
		System.out.println(cd.tail);
		System.out.println(cd.eyes);
	}

}
