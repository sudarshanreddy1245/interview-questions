package com.interview.ds.questions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowProblem {
	
	public static void main(String[] args) {
	    int arr[] = {12, 1, 78, 90, 57, 89, 56};
	    int w = 3;
	    brutForceApproch(arr, w);
	    maximumOfGivenWindow(arr,w);
	    minimumOfGivenWindow(arr,w);
	    
	  
	   
	  }
	
	
	private static void minimumOfGivenWindow(int[] arr, int k) {
		Deque<Integer> deque = new LinkedList<Integer>();
		int n = arr.length;
		int i;
		for (i=0;i<k;i++) {
			while(!deque.isEmpty() && arr[i] <= arr[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		for(;i<n;i++) {
			System.out.println(arr[deque.peek()]);
			while(!deque.isEmpty() && deque.peek() <= i-k) {
				deque.removeFirst();
			}
			while(!deque.isEmpty() && arr[i] <= arr[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		System.out.println(arr[deque.peek()]);
	}


	public static void maximumOfGivenWindow(int[] arr, int k) {
		Deque<Integer> Qi = new LinkedList<Integer>();
		int n = arr.length;
		 
        int i;
        for (i = 0; i < k; ++i)
        {
            
            while (!Qi.isEmpty() && arr[i] >=
                           arr[Qi.peekLast()])
               
                Qi.removeLast();
 
            Qi.addLast(i);
        }
        
 
        for (; i < n; ++i)
        {
         
            System.out.print(arr[Qi.peek()] + " ");
 
            while ((!Qi.isEmpty()) && Qi.peek() <=
                                             i - k)
                Qi.removeFirst();
 
            while ((!Qi.isEmpty()) && arr[i] >=
                              arr[Qi.peekLast()])
                Qi.removeLast();
 
            Qi.addLast(i);
        }
 
        System.out.print(arr[Qi.peek()]);
	}
	
	public static void brutForceApproch(int[] arr, int w) {
	    for(int i=0;i<arr.length;i++) {
	      int[] windowArray = new int[w];
	      if ((i+w) > arr.length) {
	        break;
	      } else {
	        windowArray = Arrays.copyOfRange(arr, i, i + w);
	      }
	      
	      int minimum = windowArray[0];
	      for(int j=1;j<windowArray.length;j++) {
	        minimum = Math.min(minimum, windowArray[j]);
	      }
	      System.out.println("Array Value:" + Arrays.toString(windowArray)+ " and minimum value in the array:" + minimum);
	    }
	}

}
