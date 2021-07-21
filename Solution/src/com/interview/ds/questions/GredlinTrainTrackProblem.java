package com.interview.ds.questions;

public class GredlinTrainTrackProblem {
	
	public static void findTheLampPosition(int n, int m, int[][] a) {
		int rowLength = a.length;
		int startPosition = 1;
		int result = 0;
		for (int i=0;i<rowLength;i++) {
			int currRowNum = a[i][0];
			int start = a[i][1];
			int end = a[i][2];
			while(startPosition<n && startPosition != currRowNum) {
				result += m;
				startPosition += 1;
			}
			result = result + (start-1);
			result = result + (m - end);
			startPosition += 1;
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		System.out.println(10-10+10*10);
		int m = 4;
		int n  = 4;
		int[][] a = {{2,2,3},{3,1,4},{4,4,4}};
		findTheLampPosition(n, m, a);
	}

}
