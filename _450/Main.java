package _450;

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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode newHead=new TreeNode(0, root, null);
        TreeNode pre = newHead;
        boolean ifLeft=true;
        while(root!=null && root.val!=key){
            pre=root;
            if(root.val<key){
                root=root.right;
                ifLeft=false;
            }else{
                root=root.left;
                ifLeft=true;
            }
        }
        if(root!=null){
            if(root.left==null){
                if(ifLeft){
                    pre.left=root.right;
                }else{
                    pre.right=root.right;
                }
            }else if(root.right==null){
                if(ifLeft){
                    pre.left=root.left;
                }else{
                    pre.right=root.left;
                }
            }else {
                if(ifLeft){
                    pre.left=root.right;
                }else{
                    pre.right=root.right;
                }
                TreeNode l = root.right.left;
                root.right.left = root.left;
                TreeNode node = root.left;
                while(node.right!=null){
                    node = node.right;
                }
                node.right = l;
            }

        }

        return newHead.left;
    }
}
public class Main {
}
