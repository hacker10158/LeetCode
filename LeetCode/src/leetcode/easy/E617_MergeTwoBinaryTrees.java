package leetcode.easy;

import leetcode.LeetCodeIndex;
import leetcode.Quest;

public class E617_MergeTwoBinaryTrees implements Quest {
	/* https://leetcode.com/problems/merge-two-binary-trees/
	 * 
	 * 617. Merge Two Binary Trees
	 * 
	 * 2019/4/7
	 */
	
	/**
	 * Definition for a binary tree node.
	 */
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

	@Override
	public String getTitle() {
		return LeetCodeIndex.E617_MERGE_TWO_BINARY_TREES;
	}

	@Override
	public void run() {
		//test online
	}
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		TreeNode newNode = new TreeNode(t1.val + t2.val); 
		newNode.left = mergeTrees(t1.left, t2.left);
		newNode.right = mergeTrees(t1.right, t2.right);
		return newNode;
	 }
}
