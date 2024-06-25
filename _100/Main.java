package _100;

/*mwl 二叉树是否相等
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        Queue<TreeNode> queue2 = new ArrayDeque<>();

        if(p!=null && q==null || p==null && q!=null)
            return false;
        if(p == null && q==null)
            return true;

        queue1.offer(p);
        queue2.offer(q);

        while(!queue1.isEmpty() && !queue2.isEmpty()){
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            if(node1.val !=node2.val)
                return false;
            if(node1.left!=null){
                if(node2.left == null)
                    return false;
                else{
                    queue1.offer(node1.left);
                    queue2.offer(node2.left);
                }
            }else if(node2.left != null){
                return false;
            }

            if(node1.right!=null){
                if(node2.right == null)
                    return false;
                else{
                    queue1.offer(node1.right);
                    queue2.offer(node2.right);
                }
            }else if(node2.right != null){
                return false;
            }
        }

        return true;
    }
}

public class Main {

}
