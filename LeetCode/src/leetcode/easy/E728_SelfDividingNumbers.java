package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import leetcode.LeetCodeIndex;
import leetcode.Quest;

public class E728_SelfDividingNumbers implements Quest {
	/* https://leetcode.com/problems/self-dividing-numbers/
	 * 
	 * 728. Self Dividing Numbers
	 * 
	 * 2019/4/7
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E728_SELF_DIVING_NUMBERS;
	}

	@Override
	public void run() {
		//test online
	}
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right ; i++) {
        	if (isSelfDividing(i)) {
        		result.add(i);
        		continue;
			}
        }
        
        return result;
    }
	
	boolean isSelfDividing(int num) {
		boolean selfDividing = true;
		int tmp = num;
		while (tmp > 0) {
			int value = tmp % 10;
			if (value == 0 || (num % value) != 0) {
				return false;
			}
			tmp = tmp/10;
		}
		
		return selfDividing;
	}
}
