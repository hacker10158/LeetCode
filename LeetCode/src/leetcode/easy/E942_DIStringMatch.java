package leetcode.easy;

import java.util.Arrays;
import java.util.function.IntPredicate;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E942_DIStringMatch implements Quest {
	/* https://leetcode.com/problems/di-string-match/
	 * 
	 * 942. DI String Match
	 * 
	 * 2019/4/7
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E942_DI_STRING_MATCH;
	}

	@Override
	public void run() {
		String testCase = "IDID";
		Log.d("Exp : [0, 4, 1, 3, 2], ans : " + Arrays.toString(diStringMatch(testCase)));
	}
	
	public int[] diStringMatch(String S) {
		int[] result = new int[S.length()+1];
		int head = 0;
		int tail = S.length();
		for (int i = 0; i < S.length(); i++) {
			if (String.valueOf( S.charAt(i)).equals("I")) {
				result[i] = head;
				head++;
			} else {
				result[i] = tail;
				tail--;
			}
		}
		result[S.length()] = head;
		
		return result;
    }
}
