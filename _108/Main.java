package _108;

import _utils.TreeNode;

/*
* mwl 108. 将有序数组转换为二叉搜索树
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

    public TreeNode make(int begin, int end, int[] nums){
        if(begin>end)
            return null;
        int mid = (begin+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = make(begin, mid-1, nums);
        node.right = make(mid+1, end, nums);

        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return make(0, nums.length-1, nums);
    }
}
public class Main {
}
