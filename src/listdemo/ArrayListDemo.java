package listdemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(7);
		list.add(9);
		list.add(3);

		System.out.println("List=:" + list);

		System.out.println("Size=:" + list.size());

		list.add(5);
		list.add(7);
		list.add(9);
		list.add(398);
		System.out.println(" ");

		System.out.println("List=:" + list);

		System.out.println("Size=:" + list.size());

		list.remove(0);
		list.remove(1);

		System.out.println(" ");

		System.out.println("List=:" + list);

		System.out.println("Size=:" + list.size());
	}

}
