package modifredemo;

public class Demo {

	// Public :- globally accessed
	public void publicm() {
		System.out.println("Public method");
	}

	// private :- within the class
	private void privateM() {
		System.out.println("Private method");
	}

	// Within the package , outisde the package as well through inheritence
	protected void protectm() {
		System.out.println("Protected method");
	}

	// Deafult :- it is accssed only inside the package
	void deafultm() {
		System.out.println("Deafult method");
	}

	public static void main(String[] args) {
		Demo dd = new Demo();

		dd.publicm();
		dd.privateM();
		dd.protectm();
		dd.deafultm();
	}

}
