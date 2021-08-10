package com.interview.ds.questions;

public class ConvertNumToRomanNum {
	
	final static String[] thousands = {"", "M","MM","MMM"};
	final static String[] hundreads = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	final static String[] tens = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	final static String[] ones = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};
	
	public static String getRomanNumber(int num) {
		String t = thousands[num/1000];
		String h = hundreads[(num%1000)/100];
		String x = tens[(num%100)/10];
		String i = ones[(num%10)];
		return t+h+x+i;
	}
	
	public static void main(String[] args) {
		System.out.println(getRomanNumber(549));
	}

}
