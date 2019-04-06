package leetcode.easy;

import leetcode.LeetCodeIndex;
import leetcode.Quest;

public class E832_FlippingAnImage implements Quest {
	/*
	 * https://leetcode.com/problems/flipping-an-image/
	 * 
	 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
	 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
	 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0]
	 * 
	 * 2019/4/6
	 */


	@Override
	public String getTitle() {
		return LeetCodeIndex.E832_FLIPPING_AN_IMAGE;
	}

	@Override
	public void run() {
		//run and test online
	}
	
	public int[][] flipAndInvertImage(int[][] A) {
		for(int i = 0 ; i < A.length ; i++) {
			revert(flip(A[i]));
		}
		return A;
    }
	
	public int[] flip(int[] A) {
		for(int i = 0 ; i < A.length/2; i++) {
			int tmp = A[i];
			A[i] = A[A.length-i-1];
			A[A.length-i-1] = tmp;
		}
		return A;
	}
	
	public int[] revert(int[] A) {
		for(int i = 0 ; i < A.length ; i++) {
			A[i] = (A[i] == 0) ? 1 : 0;
		}
		return A;
	}
}
