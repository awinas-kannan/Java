package com.awinas.learning.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();

//		while (iterator.hasNext()) {
//			System.out.println("Before Next");
//			System.out.println(cityCode.get(iterator.next()));
//
//			// adding an element to Map
//			// exception will be thrown on next call
//			// of next() method.
//			// modCount value differs
//			cityCode.put("Istanbul", "Turkey");
//			System.out.println("Entry added");
//		}

		// Same as working with iterator

		for (String key : cityCode.keySet()) {
			System.out.println("Before get");
			System.out.println(cityCode.get(key));
			cityCode.put("Istanbul", "Turkey");
			System.out.println("Entry added");
		}

		System.out.println(" *******************************");
		System.out.println(
				" ***********the fail-fast behavior of iterators should be used only to detect bugs.  *********");

		Iterator itr = cityCode.keySet().iterator();
		while (itr.hasNext()) {
			if (itr.next() == "Delhi") {
				// will not throw Exception
				itr.remove();
				System.out.println(cityCode);
			}
		}

	}
}