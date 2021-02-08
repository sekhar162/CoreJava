package com.demo.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailFastAndFailSafe {

	public static void main(String[] args) {
		/*
		 * 
		 * Bangalore Exception in thread "main"
		 * java.util.ConcurrentModificationException at
		 * java.util.ArrayList$Itr.checkForComodification(ArrayList.java:907) at
		 * java.util.ArrayList$Itr.next(ArrayList.java:857) at
		 * com.demo.collections.FailFastAndFailSafe.main(FailFastAndFailSafe.java:18)
		 */
		// failfast
		// List<String> arrList = new ArrayList<>();

		// failsafe
// List **********************************************************************
		CopyOnWriteArrayList<String> arrList = new CopyOnWriteArrayList<>();
		arrList.add("Bangalore");
		arrList.add("Mumbai");
		arrList.add("kolkata");

		Iterator<String> itr = arrList.iterator();
		while (itr.hasNext()) {
			itr.next();
			arrList.remove("kolkata");
		}
		System.out.println(arrList);
		// List **********************************************************************
		// Set **********************************************************************
		// failfast
		// Set<String> set = new HashSet<>();

		// failsafe
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
		set.add("Bangalore");
		set.add("Mumbai");
		set.add("kolkata");

		Iterator<String> setItr = set.iterator();
		while (setItr.hasNext()) {
			if (setItr.next() == "Mumbai")

				// it gives error when ur working with hashset and works when u r working with
				// CopyOnWriteArraySet.
				// set.remove("kolkata");

				// it works if u try to modify on set it gives error if u do modification on
				// iterator it works and this is one of the solution while working with list and
				// set. 2nd solution.
				// setItr.remove();

				set.remove("kolkata");
		}
		System.out.println(set);
		// Set **********************************************************************
		// Map **********************************************************************
		// failfast
		// Map<Integer,String> map = new HashMap<>();

		// failsafe
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Bangalore");
		map.put(2, "Mumbai");
		map.put(3, "kolkata");

		Set<Map.Entry<Integer, String>> mapItr = map.entrySet();
		for (Entry<Integer, String> entry : mapItr) {
			entry.getKey();
			entry.getValue();
			map.put(4, "Hyderabad");
		}
		System.out.println(map);
		// Set **********************************************************************

	}

}
