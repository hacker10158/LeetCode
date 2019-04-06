package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E961_N_RepeatedElementInSize2NArray implements Quest {
	/*************************************************
	 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
	 * 
	 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
	 * Return the element repeated N times.
	 * 
	 * Example 1:
	 * Input: [1,2,3,3]
	 * Output: 3
	 * Example 2:
	 * 
	 * Input: [2,1,2,5,3,2]
	 * Output: 2
	 * Example 3:
	 * 
	 * Input: [5,1,5,2,5,3,5,4]
	 * Output: 5
	 * 
	 * 2019/4/6
	 * 
	 **************************************************/
	@Override
	public String getTitle() {
		return LeetCodeIndex.E961_N_REPEATED;
	}
	
	@Override
	public void run() {
		
		int[] testCase1 = {1,2,3,3};
		Log.d("exp 3 : " + repeatedNTimes(testCase1));
		
		int[] testCase2 = {2,1,2,5,3,2};
		Log.d("exp 2 : " + repeatedNTimes(testCase2));
		
		int[] testCase3 = {5,1,5,2,5,3,5,4};
		Log.d("exp 5 : " + repeatedNTimes(testCase3));
		
	}
	
	 public int repeatedNTimes(int[] A) {
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int key : A) {
			 
			 int count = map.getOrDefault(key, 0);
			 
			 count++;
				map.put(key, count);
				if (count > 1) {
					return key;
				}
		 }
		 return 0;
	 }
}
