package _101;
/*
* mwl 对称二叉树
* */

import _utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> qLeft = new ArrayDeque<>();
        Queue<TreeNode> qRight = new ArrayDeque<>();

        if(root == null || root.left==null && root.right==null)
            return true;
        if(root.left==null || root.right==null)
            return false;
        qLeft.offer(root.left);
        qRight.offer(root.right);


        while(!qLeft.isEmpty()){
            TreeNode left = qLeft.poll();
            TreeNode right = qRight.poll();

            if(left.val != right.val)
                return false;

            if(left.left!=null){
                if(right.right==null)
                    return false;
                qLeft.offer(left.left);
                qRight.offer(right.right);
            }

            if(left.left==null){
                if(right.right!=null)
                    return false;
            }

            if(left.right!=null){
                if(right.left==null)
                    return false;
                qLeft.offer(left.right);
                qRight.offer(right.left);
            }

            if(left.right==null){
                if(right.left!=null)
                    return false;
            }

        }
        return true;
    }
}

public class Main {
}
