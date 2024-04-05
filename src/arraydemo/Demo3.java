package arraydemo;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(23);
		list.add(34);
		list.add(67);

		System.out.println("List size=:" + list.size());
		System.out.println(list);

		list.add(10);
		list.add(23);
		list.add(34);
		list.add(67);
		System.out.println(" ");
		System.out.println("List size=:" + list.size());
		System.out.println(list);

		list.add(99);
		list.add(98);
		list.add(57);
		list.add(12);
		list.add(11);

		System.out.println(" ");
		System.out.println("List size=:" + list.size());
		System.out.println(list);

		list.remove(0);
		list.remove(7);
		list.remove(4);
		System.out.println(" ");
		System.out.println("List size=:" + list.size());
		System.out.println(list);

	}

}
