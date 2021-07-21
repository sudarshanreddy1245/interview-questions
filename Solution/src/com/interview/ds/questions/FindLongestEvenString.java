package com.interview.ds.questions;

public class FindLongestEvenString {
	
	public static void main(String[] args) {
		System.out.println(findLongestEvenString("The sample output is not bad"));
	}
	
	public static String findLongestEvenString(String input) {
		String[] split = input.split(" ");
		String maxSubStr = "";
		for ( int i=0;i<split.length;i++) {
			String currStr = split[i]; 
			if(currStr.length() % 2 == 0 && currStr.length() > maxSubStr.length()) {
				maxSubStr = currStr;
			}
			
		}
		return maxSubStr;
	}

}
