package stringdemo;

public class Demo {

	public static void main(String[] args) {

		String s1 = "cetpa";

		String s2 = new String("cetpa");

		String s3 = "cetpa";

		String s4 = new String("cetpa");

		String s5 = "infotech";

		// == :- Memory reference

		System.out.println(s1 == s2);

		System.out.println(s1 == s3);

		System.out.println(s2 == s4);

		System.out.println(" ");

		// .equals() :- content

		System.out.println(s1.equals(s2));

		System.out.println(s2.equals(s4));

		System.out.println(s4.equals(s5));

	}

}
