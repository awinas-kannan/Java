package com.awinas.learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class CrayonDataQuestion {

	public static void main(String[] args) {
		String str = "abcdaf";

		Map<Character, Integer> counterMap = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			counterMap.put(str.charAt(i),
					counterMap.get(str.charAt(i)) != null ? counterMap.get(str.charAt(i)) + 1 : 1);
		}

		System.out.println(counterMap);

		boolean isFound = false;
		char cha = ' ';
		for (Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
			if (entry.getValue() == 1) {
				isFound = true;
				cha = entry.getKey();
				break;
			}
		}
		if (!isFound) {
			System.out.println(-1);
		} else {
			System.out.println(cha);
		}

	}

}
