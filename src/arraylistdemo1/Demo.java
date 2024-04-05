package arraylistdemo1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(5);
		list.add(2);
		list.add(7);

		System.out.println(list);
		System.out.println(list.size());

		list.add(10);
		list.add(5);
		list.add(2);
		list.add(7);

		System.out.println(" ");
		System.out.println(list);
		System.out.println(list.size());

	}

}
