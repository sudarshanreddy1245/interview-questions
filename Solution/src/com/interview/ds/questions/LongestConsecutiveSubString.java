package com.interview.ds.questions;

public class LongestConsecutiveSubString {
	
	public static void main(String[] args) {
		findLongestConsecutiveSum();
		findLongestConsecutiveSum1();
	}

	private static void findLongestConsecutiveSum() {
		String str = "abcabcdefabcdefghab";
		int result = 1;
		int curreSeq = 1;
		int prevCharValue = str.charAt(0);
		for (int i=1;i<str.length();i++) {
			int currentChar = str.charAt(i);
			if (prevCharValue+1 == currentChar) {
				curreSeq += 1;
			} else {
				if (curreSeq > result) {
					result = curreSeq;
				}
				curreSeq = 1;
			}
			prevCharValue = currentChar;
		}
		System.out.println(result);
	}
	
	private static void findLongestConsecutiveSum1() {
		String str = "aaabbbbcc";
		int result = 1;
		int curreSeq = 1;
		int prevCharValue = str.charAt(0);
		for (int i=1;i<str.length();i++) {
			int currentChar = str.charAt(i);
			if (prevCharValue == currentChar) {
				curreSeq += 1;
			} else {
				if (curreSeq > result) {
					result = curreSeq;
				}
				curreSeq = 1;
			}
			prevCharValue = currentChar;
		}
		System.out.println(result);
	}

}
