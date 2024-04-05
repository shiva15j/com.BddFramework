package accessmodfires;

public class Demo {

	// GLobally accessed
	public void PublicM() {
		System.out.println("Public Method");
	}

	// In class access
	private void PrivateM() {
		System.out.println("Private Method");
	}

	// Within package , outisde package with inheritence
	protected void ProtectedM() {
		System.out.println("Protected Method");
	}

	// Within the package
	void DefaultM() {
		System.out.println("Default Method");
	}

	public static void main(String[] args) {

		Demo dd = new Demo();

		dd.PublicM();
		dd.PrivateM();
		dd.ProtectedM();
		dd.DefaultM();

	}

}
