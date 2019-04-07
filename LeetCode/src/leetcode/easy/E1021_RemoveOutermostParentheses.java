package leetcode.easy;

import leetcode.LeetCodeIndex;
import leetcode.Quest;
import tools.Log;

public class E1021_RemoveOutermostParentheses implements Quest {
	/* https://leetcode.com/problems/remove-outermost-parentheses/
	 * 
	 * 1021. Remove Outermost Parentheses
	 * 
	 * 2019/4/7
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E1021_REMOVE_OUTERMOST_PAR;
	}

	@Override
	public void run() {
		String testCase1 = "(()())(())";
		Log.d("Exp : ()()() , ans : " + removeOuterParentheses(testCase1));
	
		String testCase2 = "(()())(())(()(()))";
		Log.d("Exp : ()()()()(()) , ans : " + removeOuterParentheses(testCase2));
	}
	
	public String removeOuterParentheses(String S) {
		String result = "";
		int counter = 0;
		int index = 0;
		for(int i = 0 ; i < S.length() ; i++) {
			if (counter == 0) {
				index = i;
			}
			if ("(".equals(S.substring(i,i+1))) {
				counter++;
			} else {
				counter--;
			}
			
			if (counter == 0) {
				result = result + S.substring(index+1, i);
			}
		}
	 
	 	return result;
	}
}

