package leetcode.easy;

import java.util.Arrays;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E905_SortArrayByParity implements Quest {
	/*
	 * https://leetcode.com/problems/sort-array-by-parity/
	 * 
	 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
	 * 
	 * Example 1:
	 * Input: [-4,-1,0,3,10]
	 * Output: [0,1,9,16,100]
	 * 
	 * Example 2:
	 * Input: [-7,-3,2,3,11]
	 * Output: [4,9,9,49,121]
	 * 
	 * 2019/4/6
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E977_SQUARES_OF_A_SORTED_ARRAY;
	}

	@Override
	public void run() {
		int[] testCase1 = {-4,-1,0,3,10};	
	
		Log.d("exp [0,1,9,16,100] : " + Arrays.toString(sortedSquares(testCase1)));

	}
	
	public int[] sortedSquares(int[] A) {
		
		for(int i = 0; i < A.length; i++) {
			A[i] = A[i]*A[i];
		
		}
		Arrays.sort(A);
		return A;
    }
}
