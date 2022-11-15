package collectionsFramewors;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("Selenium");
		h.add("test");
		h.add("training");
		h.add("practice");
		h.add("core java");
		h.add("practice");
		h.add("practice");

		h.remove("test");
		
		Iterator<String> it = h.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}
		System.out.println(h.isEmpty());

	}

}
