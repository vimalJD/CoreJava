package map.concreteclasses;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MpaClassesDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		LinkedHashMap lhm = new LinkedHashMap();
		TreeMap tm = new TreeMap();

		hm.put("Tom", new Double(4000.0));
		hm.put("John", new Double(3500.50));
		hm.put("Smith", new Double(2125.25));

		lhm.put("Tom", new Double(4000.0));
		lhm.put("John", new Double(3500.50));
		lhm.put("Smith", new Double(2125.25));

		tm.put("Abc", new Double(4000.0));
		tm.put("Cbc", new Double(3500.50));
		tm.put("Bbc", new Double(2125.25));

		System.out.println("hm elements: " + hm);
		System.out.println("lhm elements: " + lhm);
		System.out.println("tm elements: " + tm);
		// Getting the set of keys and getting the iterator

		Set set = hm.keySet();
		Iterator hmItr = set.iterator();

		System.out.println("\nThe Account balance hm Account holders:");

		while (hmItr.hasNext()) {
			Object key = hmItr.next();
			Object value = hm.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();

		System.out.println("\nThe Account balance lhm Account holders:");
		// Getting the collection of values and getting the iterator

		Collection lhmCol = lhm.values();
		Iterator lhmItr = lhmCol.iterator();

		while (lhmItr.hasNext()) {

			System.out.println(lhmItr.next());
		}
		System.out.println();

		System.out.println("\nThe Account balance tm Account holders:");
		// Getting set of entries and obtaining iterator

		Set tmSet = tm.entrySet();
		Iterator tmItr = tmSet.iterator();

		while (tmItr.hasNext()) {

			Map.Entry me = (Map.Entry) tmItr.next();

			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}

		double balance = ((Double) hm.get("John")).doubleValue();
		hm.put("John", new Double(balance + 1000));

		System.out.println("John's new balance: " + hm.get("John"));

	}
}
