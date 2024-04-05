package inheritencedem;

public class HumanMain {

	public static void main(String[] args) {

		Parent pp = new Parent();

		pp.eye();
		pp.nose();

		System.out.println(" ");

		Child cc = new Child();
		cc.eye();
		cc.nose();
		cc.walk();

		System.out.println(" ");

		Grandchild gg = new Grandchild();
		gg.eye();
		gg.nose();
		gg.walk();
		gg.run();

		System.out.println(" ");

		Child1 cd = new Child1();

		cd.eye();
		cd.nose();
		cd.eat();

	}

}
