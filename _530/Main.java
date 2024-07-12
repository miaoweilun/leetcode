package _530;

import _utils.TreeNode;

/*
* mwl 530. 二叉搜索树的最小绝对差
* */

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
    int pre=-1;
    int ans=Integer.MAX_VALUE;

    public void midSearch(TreeNode node){
        if(node==null)
            return;
        midSearch(node.left);

        if(pre!=-1){
            ans = Math.min(ans, node.val-pre);
        }
        pre=node.val;
        midSearch(node.right);
    }

    public int getMinimumDifference(TreeNode root) {
        midSearch(root);
        return ans;
    }
}

public class Main {
}
