package com.interview.ds.questions;

//Java program to print all combination of size r in an array of size n
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintCombinationOfElements {
	
	public static List<int[]> list = new ArrayList<int[]>();

	/* arr[] ---> Input Array
	data[] ---> Temporary array to store current combination
	start & end ---> Staring and Ending indexes in arr[]
	index ---> Current index in data[]
	r ---> Size of a combination to be printed */
	static void combinationUtil(int arr[], int data[], int start,
								int end, int index, int r)
	{
		// Current combination is ready to be printed, print it
		if (index == r)
		{
			/*
			 * for (int j=0; j<r; j++) System.out.print(data[j]+" ");
			 * System.out.println("");
			 */
			int data1[] = new int[data.length];
			for (int i=0;i<data.length;i++)
				data1[i] = data[i];
			list.add(data1);
			return;
		}

		// replace index with all possible elements. The condition
		// "end-i+1 >= r-index" makes sure that including one element
		// at index will make a combination with remaining elements
		// at remaining positions
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r);
		}
	}

	// The main function that prints all combinations of size r
	// in arr[] of size n. This function mainly uses combinationUtil()
	static void printCombination(int arr[], int n, int r)
	{
		// A temporary array to store all combination one by one
		int data[]=new int[r];

		// Print all combination using temporary array 'data[]'
		combinationUtil(arr, data, 0, n-1, 0, r);
	}

	/*Driver function to check for above function*/
	public static void main (String[] args) {
		int arr[] = {1, 2, 3, 4};
		int r = 3;
		int n = arr.length;
		printCombination(arr, n, r);
		print(list);
		
	}
	
	public static void print(List<int[]> list) {
		for(int[] arr1: list) {
			System.out.println("Arrays:" +Arrays.toString(arr1));
		}
	}
}

/* This code is contributed by Devesh Agrawal */
