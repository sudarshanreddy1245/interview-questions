package com.interview;

import java.util.Arrays;

public class ConsecutiveArraySum {
	
	public static void main(String[] args) {
		int[] arr = {8, 5, 4, 3, 15, 20, 30};
		int maxSum = arr[0] + arr[1];
		int[] consecutiveElem = new int[2];
		consecutiveElem[0] = arr[0];
		consecutiveElem[1] = arr[0];
		
		for (int i = 2; i< arr.length;i++) {
			int currSum = arr[i] + arr[i-1];
			if (maxSum < currSum) {
				maxSum = currSum;
				consecutiveElem[0] = arr[i-1];
				consecutiveElem[1] = arr[i];
			}
		}
		System.out.println(maxSum);
		System.out.println(Arrays.toString(consecutiveElem));
	}

}
