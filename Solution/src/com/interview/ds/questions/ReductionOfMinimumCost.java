package com.interview.ds.questions;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ReductionOfMinimumCost {
	
	/**
	 * Explanantion: {1,2,3,4}
	 * Step1 : 1+2 => 3 => {3,4,3}
	 * Step2 : 3+3 (pickup minimum element) => 6 => {4,6}
	 * Step3 : 4+6  => 10 => {}
	 * o/p : 3+6+10 = 19
	 * @param args
	 */
	
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(minReduction(list));
		
	}
	
	public static int minReduction(List<Integer> num) {
		if (num == null ||num.isEmpty())
			return 0;
		int reduction = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(num);
		while (queue.size() > 1) {
			int first = queue.poll();
			int second = queue.poll();
			int result = first +second;
			reduction += result;
			queue.add(result);
		}
		return reduction;
	}

}
