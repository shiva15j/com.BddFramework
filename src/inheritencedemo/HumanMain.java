package inheritencedemo;

public class HumanMain {

	public static void main(String[] args) {

		Parent pp = new Parent();

		pp.eat();
		pp.sleep();

		System.out.println(" ");

		Child cc = new Child();

//		cc.eat();
//		cc.sleep();
		cc.cry();

	}

}
