package keywoarddemo;

public class Computermain {

	public static void main(String[] args) {

		Computer cm = new Computer();
		cm.storage();
		cm.processor();

		System.out.println(" ");

		Laptop lp = new Laptop();
		lp.ram();

		System.out.println(" ");
		System.out.println("This & Super");
		System.out.println(" ");
		lp.display();

	}

}
