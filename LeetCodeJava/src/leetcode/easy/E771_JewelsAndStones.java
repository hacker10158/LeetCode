package leetcode.easy;

import java.util.HashSet;

import leetcode.LeetCodeIndex;
import leetcode.Quest;

public class E771_JewelsAndStones implements Quest {
	/* 
	 * Jewels and Stones
	 * 
	 * 2018/11/8
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E771_JEWELS_AND_STONES;
	}

	@Override
	public void run() {
		//run online
	}
	
    public int numJewelsInStones(String J, String S) {
        
        HashSet<String> set = new HashSet<>();
        for (int i = 0 ; i < J.length() ; i++) {
            String key = J.substring(i, i+1);
            set.add(key);
        }
        int ans = 0;
        for (int i = 0 ; i < S.length() ; i++) {
            String key = S.substring(i, i+1);
            if (set.contains(key)) {
                ans ++;
            }
        }

        return ans;
    }
}
