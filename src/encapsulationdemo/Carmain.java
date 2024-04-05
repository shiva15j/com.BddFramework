package encapsulationdemo;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Car();

		cc.setBrand("BMW");
		cc.setColor("Black");
		cc.setPrice(1000);

//		System.out.println(cc.getPrice());
//		System.out.println(cc.getBrand());
//		System.out.println(cc.getColor());

		System.out.println(cc);
	}

}
