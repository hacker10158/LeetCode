package leetcode.easy;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E461_Hamming_Distance implements Quest {
	/* https://leetcode.com/problems/hamming-distance/
	 * 
	 * 461. Hamming Distance
	 * 
	 * 2019/4/7
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E461_HAMMING_DISTANCE;
	}

	@Override
	public void run() {
		//test case 
		Log.d("Exp : 2 , " + hammingDistance(1, 4));
	}
	
	public int hammingDistance(int x, int y) {
		int distance = 0;
		while (x > 0 || y > 0) {
			if (x%2 != y %2) {
				distance ++;
			}
			x /= 2;
			y /= 2;
		}
		return distance;
    }
}
