package collectionsFramewors;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		h.put("Rahul", 60);
		h.put("venkat", 70);
		h.put("Madhu", 80);
		h.put("Swapnith", 90);
		h.put("Prasanth", 100);
		h.put("gangaraju", null);
		h.put("Rahul", 77);
		h.put(null, 60);

		// System.out.println(h.get(null));

		Set set = h.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {

			Entry map = (Map.Entry) it.next();

			System.out.println(map.getKey() + "--------->" + map.getValue());

		}

	}

}
