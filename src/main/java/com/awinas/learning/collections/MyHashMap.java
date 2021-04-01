package com.awinas.learning.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//https://howtodoinjava.com/java-hashmap/

//hash vaue is zero for null key


//https://stackoverflow.com/questions/948194/difference-between-java-enumeration-and-iterator#:~:text=1)%20The%20main%20difference%20between,not%20have%20remove()%20method.&text=Iterator%20is%20not%20a%20legacy%20interface.
public class MyHashMap {

	public static void main(String[] args) {

		String[] aa = new String[11];
		System.out.println("lenght->" + aa.length);
		String a = "Awinas";
		System.out.println(a.hashCode());
		System.out.println(0x7FFFFFFF);
		System.out.println("Index - >" + (a.hashCode() & 0x7FFFFFFF) % 11);
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(3, "E");
		map.put(5, "E");
		map.put(6, "E");
		map.put(null, "AA");
		map.put(null, "B");
		map.put(77, null);
		map.put(88, null);

		System.out.println(map);
		System.out.println(map.remove(0));
		System.out.println(map.remove(1));
		System.out.println(map);
		
		Iterator<Integer> itr = map.keySet().iterator();
		 
		while (itr.hasNext()) 
		{
		    Integer key = itr.next();
		    String value = map.get(key);
		     
		    System.out.println("The key is :: " + key + ", and value is :: " + value );
		}
		 
		System.out.println("//Iterate over entries set");
		 
		Iterator<Entry<Integer, String>> entryIterator = map.entrySet().iterator();
		 
		while (entryIterator.hasNext()) 
		{
		    Entry<Integer, String> entry = entryIterator.next();
		     
			System.out.println("The key is :: " + entry.getKey() + ", and value is :: " + entry.getValue() );
		}

	}

}
