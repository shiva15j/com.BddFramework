package inheritencedemo1;

public class Parentmain {

	public static void main(String[] args) {

		Parent pp;

		pp = new Parent();
		pp.eat();
		pp.sleep();

		System.out.println(" ");

		Child cc = new Child();

		cc.eat();
		cc.sleep();
		cc.cry();
		cc.play();

		System.out.println(" ");

		Grandchild gg = new Grandchild();
		gg.eat();
		gg.sleep();
		gg.cry();
		gg.play();
		gg.run();
		gg.study();

		System.out.println(" ");

		System.out.println("Upcasting=:");
		pp = new Child();
		pp.eat();
		pp.sleep();
		// pp.cry();

	}

}
