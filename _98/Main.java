package _98;
/*
* mwl 验证二叉搜索树
* */

import _utils.TreeNode;

class Solution {

    private Integer pre;
    private boolean result;

    public Solution(){
        pre=null;
        result=true;
    }

    public void midSearch(TreeNode root){
        if(root==null)
            return;
        midSearch(root.left);
        if(pre==null)
            pre=root.val;
        else if(pre>=root.val){
            result = false;
        }else{
            pre=root.val;
        }
        midSearch(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        midSearch(root);
        return result;
    }
}
public class Main {
}
