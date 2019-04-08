package leetcode.easy;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E852_PeakIndexInAMountainArray implements Quest {
	/* https://leetcode.com/problems/peak-index-in-a-mountain-array/
	 * 
	 * 852. Peak Index in a Mountain Array
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E852_PEAK_INDEX_IN_A_MOUNTAIN;
	}

	@Override
	public void run() {
		int[] testCase1 = {0,1,0};
		int[] testCase2 = {0,2,1,0};
		
		Log.d("Exp : 1 , ans :" + peakIndexInMountainArray(testCase1));
		Log.d("Exp : 1 , ans :" + peakIndexInMountainArray(testCase2));
	}
	
	public int peakIndexInMountainArray(int[] A) {
        for(int i = 1; i < A.length-1; i++) {
        	if (A[i-1] < A[i] && A[i] > A[i+1]) {
        		return i;
			}
        }
        
        return 0;
    }
}
