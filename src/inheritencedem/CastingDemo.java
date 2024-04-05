package inheritencedem;

public class CastingDemo {

	public static void main(String[] args) {
		
		//Without upcasting you can not do downcasting

		Parent pp;

		pp = new Parent();
		pp.eye();
		pp.nose();

		System.out.println("Upcast=:");
		System.out.println(" ");

		pp = new Child();

		pp.eye();
		pp.nose();

		System.out.println(" ");
		System.out.println("Downcast=:");
		Child cc = (Child) pp;

		cc.eye();
		cc.nose();
		cc.walk();

	}

}
