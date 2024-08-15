package _1372;
// 1372. 二叉树中的最长交错路径

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

    public int ans;

    public int findLongest(TreeNode node, int length, boolean left){
        if(node==null)
            return length-1;
        int length1=0, length2=0, max=0;
        if(left){
            length1=findLongest(node.left, length+1, false);
            length2=findLongest(node.right, 1, true);
        }else{
            length1=findLongest(node.left, 1, false);
            length2=findLongest(node.right, length+1, true);
        }
        max=Math.max(length1, length2);
        // System.out.println(node.val + " : " + max);
        if(max>ans)
            ans=max;
        if(left){
            return length1;
        }else{
            return length2;
        }
    }

    public int longestZigZag(TreeNode root) {
        findLongest(root, 0, true);
        return ans;
    }
}

public class Main {
}
