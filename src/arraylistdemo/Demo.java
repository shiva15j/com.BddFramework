package arraylistdemo;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);

		list.add(12);

		list.add(19);

		list.add(25);

		System.out.println("Size=:" + list.size());
		System.out.println("List=:" + list);

		list.add(5);

		list.add(12);

		list.add(19);

		list.add(25);

		System.out.println(" ");
		System.out.println("Size=:" + list.size());
		System.out.println("List=:" + list);

		list.add(34);
		list.add(23);

		System.out.println(" ");
		System.out.println("Size=:" + list.size());
		System.out.println("List=:" + list);

		list.remove(2);
		list.remove(4);
		list.remove(5);
		
		
		System.out.println(" ");
		System.out.println("Size=:" + list.size());
		System.out.println("List=:" + list);

	}

}
