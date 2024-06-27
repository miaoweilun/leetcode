package _230;
/*
* mwl 二叉搜索树中第K小的元素
* */

import _utils.TreeNode;

class Solution {

    private TreeNode ans;
    private int count;

    public Solution(){
        ans = null;
        count = 0;
    }

    public void midSearch(TreeNode root, int k){
        if(root==null)
            return ;
        midSearch(root.left, k);
        if(++count==k)
            ans = root;
        midSearch(root.right, k);

    }

    public int kthSmallest(TreeNode root, int k) {
        midSearch(root, k);
        return ans.val;
    }
}

public class Main {
}
