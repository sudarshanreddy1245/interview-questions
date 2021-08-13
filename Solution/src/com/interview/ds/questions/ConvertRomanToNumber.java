package com.interview.ds.questions;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToNumber {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);


		String str = "CDXCIV";// 14

		int sum = 0;
		for (int i = 0; i < str.length();) {

			int curr = map.get(str.charAt(i));
			int next = map.get(str.charAt(i + 1));

			if (curr < next) {
				sum = sum + (next - curr);
				i = i + 2;
			} else {
				i++;
				sum = sum + curr;
			}
		}
		System.out.println(sum);
	}

}
