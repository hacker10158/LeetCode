package leetcode;

import leetcode.easy.E832_FlippingAnImage;
import leetcode.easy.E905_SortArrayByParity;
import leetcode.easy.E961_N_RepeatedElementInSize2NArray;
import leetcode.easy.E977_SquaresOfASortedArray;

public class EasyQuestFactory {
	
	public Quest createQuest(String name) {
		switch (name) {
		default:
		case LeetCodeIndex.E832_FLIPPING_AN_IMAGE:
			return new E832_FlippingAnImage();
		case LeetCodeIndex.E905_SORT_ARAY_BY_PRIORITY:
			return new E905_SortArrayByParity();
		case LeetCodeIndex.E961_N_REPEATED:
			return new E961_N_RepeatedElementInSize2NArray();
		case LeetCodeIndex.E977_SQUARES_OF_A_SORTED_ARRAY:
			return new E977_SquaresOfASortedArray();
		}
	}
}
