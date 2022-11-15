package collectionsFramewors;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(1);
		a.add(7);
		a.add(3);
		a.add("Selenium");
		a.add('c');
		a.add(true);
		a.add(1);
		a.add(null);

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		a.remove(1);
		System.out.println();
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		a.add(2, "Training");
		System.out.println();
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println();
		boolean status = a.contains(6);
		System.out.println(status);
		System.out.println();

		System.out.println(a.indexOf(3));

		ArrayList<Integer> b = new ArrayList<Integer>(); // the thing present inside arrow keys is called as generics
		ArrayList<String> c = new ArrayList<String>();
		System.out.println(b.isEmpty());
		b.add(5);
		c.add("String abc");
		//c.add(7);

	}

}
