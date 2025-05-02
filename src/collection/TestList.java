package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');

		System.out.println("list => " + list); // will print a b c d

		list.add(2, "one"); // add "one" at index 2

		System.out.println("list => " + list.get(2)); // will print element at index 2 i.e one

		System.out.println("list => " + list); // will print a b one c d

		list.remove(2); // remove element at index 2

		System.out.println("list => " + list); // will print a b c d

		list.set(2, "one"); // will replace element at index 2 => c -> one

		System.out.println("list => " + list); // will print a b one d

		System.out.println("list indexOf => " + list.indexOf('a'));

		System.out.println(list.subList(0, 3)); // will print array from index 0 to 2
	}
}