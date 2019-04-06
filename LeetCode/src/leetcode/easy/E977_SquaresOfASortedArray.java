package leetcode.easy;

import java.util.Arrays;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E977_SquaresOfASortedArray implements Quest {

	/* https://leetcode.com/problems/squares-of-a-sorted-array/
	 * 
	 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
	 * 
	 * You may return any answer array that satisfies this condition.
	 * 
	 * Example 1:
	 * Input: [3,1,2,4]
	 * Output: [2,4,3,1]
	 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 * 
	 * 2019/4/6
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E977_SQUARES_OF_A_SORTED_ARRAY;
	}

	@Override
	public void run() {
		int[] testCase1 = {3,1,2,4};	
	
		Log.d("The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted. :\n " + Arrays.toString(sortArrayByParity(testCase1)));

	}
	
	public int[] sortArrayByParity(int[] A) {
		
		int evenIndex = 0;
        for(int index = 0; index < A.length ; index ++) {
        	if (A[index]%2 == 0) { //swap to evenIndex
				int tmp = A[evenIndex];
				A[evenIndex] = A[index];
				A[index] = tmp;
				evenIndex ++;
			}
        }
        
        return A;
    }
	
}
