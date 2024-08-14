package _1448;

// mwl 1448. 统计二叉树中好节点的数目

import _utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int ans;

    public void findGood(TreeNode node, int max){
        if(node==null)
            return;
        if(node.val>=max){
            max=node.val;
            ans++;
        }
        findGood(node.left, max);
        findGood(node.right, max);
    }

    public int goodNodes(TreeNode root) {

        findGood(root, Integer.MIN_VALUE);
        return ans;
    }
}

public class Main {
}
