package inheritencedemo2;


//You can not inherit a final class
final public class Phone {

	
	//You can not change the value of a final variable
	final String tone = "hello";

	public void calling() {
		System.out.println("Calling!!!!!");
	}

	//You can not override a final method
	final public void camera() {
		System.out.println("32 mp");
	}

	public void alarm() {
		//tone = "good morning";

		System.out.println("Alaram does =:" + tone);
	}

}
