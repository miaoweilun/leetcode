package _112;

import _utils.TreeNode;

class Solution {

    public boolean count(TreeNode node, int sum, int target){
        int s = node.val+sum;
        if(node.left==null && node.right==null){
            if(target==s)
                return true;
            return false;
        }

        boolean result = false;
        if(node.left!=null)
            result = count(node.left, s, target);
        if(node.right!=null)
            result = result || count(node.right, s, target);
        return result;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root!=null){
            return count(root, 0, targetSum);
        }
        return false;
    }
}

public class Main {
}
