package _872;

// 872. 叶子相似的树

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

    private List<Integer> list;
    private int index;
    private boolean ans;

    public void addLeaf(TreeNode node, boolean flag){
        if(ans==false)
            return;
        if(node.left==null && node.right==null){
            // System.out.println(node.val);
            if(flag){
                list.add(node.val);
            }else{
                if(index>=list.size() || list.get(index++)!=node.val){
                    ans=false;
                    return;
                }
            }
        }
        if(node.left!=null)
            addLeaf(node.left, flag);
        if(node.right!=null)
            addLeaf(node.right, flag);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        index = 0;
        ans=true;
        addLeaf(root1, true);
        // System.out.println();
        addLeaf(root2, false);
        if(index!=list.size())
            ans = false;
        return ans;
    }
}

public class Main {
}
