package classandobject;

public class Dogmain {

	public static void main(String[] args) {

		// instance of a class
		// When ever you create an object a new constructor is called

		Dog dd ;
		dd= new Dog();
		
		dd.bark();
		dd.eat();
		dd.sleep();
		System.out.println(dd.tail);
		System.out.println(dd.color);
		System.out.println(dd.eyes);

		System.out.println(" ");
		Dog de = new Dog("German shefard");
		de.bark();
		de.eat();
		de.sleep();
		System.out.println(de.tail);
		System.out.println(de.color);
		System.out.println(de.eyes);
		
		

	}

}
