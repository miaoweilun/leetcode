package _129;

/*
* mwl 129. 求根节点到叶节点数字之和
* */

import _utils.TreeNode;

class Solution {

    public int count(TreeNode node, int sum){
        int value = sum*10+node.val;
        if(node.left==null && node.right==null){
            //System.out.println(value);
            return value;
        }

        int result = 0;

        if(node.left!=null)
            result+=count(node.left, value);

        if(node.right!=null)
            result+=count(node.right, value);

        return result;
    }

    public int sumNumbers(TreeNode root) {
        if(root!=null)
            return count(root, 0);
        return 0;
    }
}

public class Main {
}
