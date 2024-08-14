package _437;
// 437. 路径总和 III

import _utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
    private int targetSum;

    public void isPath(TreeNode node, List<Long> list){
        long count=0;
        list.add((long)node.val);
        for(int i=list.size()-1; i>=0; i--){

            count+=list.get(i);
            // System.out.printf(" %d(%d) ", list.get(i), count);
            if(count==targetSum){
                // System.out.printf(" YES!!! \n jieguo: %d  %d ", targetSum, count);
                ans++;
            }
        }
        // System.out.println();

        if(node.left!=null){
            List<Long> newList = new ArrayList<>(list);
            isPath(node.left, newList);
        }

        if(node.right!=null){
            isPath(node.right, list);
        }

    }


    public int pathSum(TreeNode root, int targetSum) {
        if(root!=null){
            this.targetSum=targetSum;
            List<Long> list = new ArrayList<>();
            isPath(root, list);
        }
        return ans;
    }
}

public class Main {
}
