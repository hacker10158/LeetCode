package leetcode.easy;

import java.util.Arrays;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E561_Array_Partition_I implements Quest {
	/* https://leetcode.com/problems/array-partition-i/
	 * 
	 * 561. Array Partition I
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E561_ARRAY_PARTITION_I;
	}

	@Override
	public void run() {
		int[] testCase1 = {1,4,3,2};
		Log.d("Exp : 4 , ans : " + arrayPairSum(testCase1));
	}
	
	 public int arrayPairSum(int[] nums) {
		 Arrays.sort(nums);
		 int sum =0;
		 for(int i = 0 ; i < nums.length ; i+=2) {
			 sum += nums[i];
		 }
		 
		 return sum;
	 }
}
