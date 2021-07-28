package com.interview.ds.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonConstructableChange {
	
	//Complexcity 0(nlogn)
	public static int nonConstructableChange(List<Integer> coins) {
		//1. Sort
		Collections.sort(coins);
		
		int changeAlreadyCreated = 0;
		
		for (Integer coin : coins) {
			int changesToBeCreated = changeAlreadyCreated + 1;
			if (coin > changesToBeCreated) {
				return changesToBeCreated;
			}
			changeAlreadyCreated = changeAlreadyCreated + coin;
		}
		return changeAlreadyCreated;
	}
	
	public static void main(String[] args) {
		
//		  List<Integer> list = new ArrayList<Integer>(); 
//		  list.add(1); 
//		  list.add(2);
//		  list.add(5);
		 
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(22);
		System.out.println(nonConstructableChange(list));
	}

}
