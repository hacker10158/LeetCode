package leetcode;

import leetcode.easy.E1021_RemoveOutermostParentheses;
import leetcode.easy.E461_Hamming_Distance;
import leetcode.easy.E561_Array_Partition_I;
import leetcode.easy.E832_FlippingAnImage;
import leetcode.easy.E852_PeakIndexInAMountainArray;
import leetcode.easy.E905_SortArrayByParity;
import leetcode.easy.E942_DIStringMatch;
import leetcode.easy.E961_N_RepeatedElementInSize2NArray;
import leetcode.easy.E977_SquaresOfASortedArray;

public class EasyQuestFactory {
	
	public Quest createQuest(String name) {
		switch (name) {
		default:
		case LeetCodeIndex.E461_HAMMING_DISTANCE:
			return new E461_Hamming_Distance();
		case LeetCodeIndex.E561_ARRAY_PARTITION_I:
			return new E561_Array_Partition_I();
		case LeetCodeIndex.E832_FLIPPING_AN_IMAGE:
			return new E832_FlippingAnImage();
		case LeetCodeIndex.E852_PEAK_INDEX_IN_A_MOUNTAIN:
			return new E852_PeakIndexInAMountainArray();
		case LeetCodeIndex.E905_SORT_ARAY_BY_PRIORITY:
			return new E905_SortArrayByParity();
		case LeetCodeIndex.E942_DI_STRING_MATCH:
			return new E942_DIStringMatch();
		case LeetCodeIndex.E961_N_REPEATED:
			return new E961_N_RepeatedElementInSize2NArray();
		case LeetCodeIndex.E977_SQUARES_OF_A_SORTED_ARRAY:
			return new E977_SquaresOfASortedArray();
		case LeetCodeIndex.E1021_REMOVE_OUTERMOST_PAR:
			return new E1021_RemoveOutermostParentheses();
		}
	}
}
