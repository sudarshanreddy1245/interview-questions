package com.interview.ds.questions;

public class MinimumJumps {
	
	public static void main(String[] args) {
		int flagHeight = 13;
		int bigJump = 2;
		System.out.println(findMinJump(flagHeight, bigJump));
	}
	
	public static int findMinJump(int flagHeight, int bigJump) {
		if (flagHeight == 0) {
			return 0;
		}
		int result =0;
		while (flagHeight > 0 && flagHeight >= bigJump) {
			result += 1;
			flagHeight -= bigJump; 
		}
		result += flagHeight;
		return result;
	}

}
