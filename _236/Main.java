package _236;

import _utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    public boolean findNode(TreeNode node, TreeNode p, TreeNode q){
        if(node == null)
            return false;
        boolean lResult = findNode(node.left, p, q);
        boolean rResult = findNode(node.right, p, q);
        boolean fResult = (node.val==p.val||node.val==q.val);

        if(lResult&&rResult||fResult&&(lResult||rResult))
            this.ans = node;

        return lResult || rResult || fResult;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findNode(root, p, q);
        return this.ans;
    }
}
public class Main {
}
