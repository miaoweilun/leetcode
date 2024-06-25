package _114;


/*
* mwl 二叉树展开为链表
* */

import _utils.TreeNode;

import java.util.Stack;

class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        if(root != null)
            stack.push(root);

        TreeNode lastNode = null;
        while(!stack.isEmpty()){
            TreeNode buffer = stack.pop();
            if(lastNode != null){
                lastNode.left = null;
                lastNode.right = buffer;
            }
            if(buffer.right != null)
                stack.push(buffer.right);
            if(buffer.left != null)
                stack.push(buffer.left);
            lastNode = buffer;

        }
        if(lastNode!= null )lastNode.left = null;
    }
}

public class Main {
}
