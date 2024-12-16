package _94;


import _utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        if(root==null)
            return null;

        List<Integer> left = inorderTraversal(root.left);
        List<Integer> right = inorderTraversal(root.right);
        List<Integer> list = new ArrayList<>();
        if(left!=null)
            list.addAll(0, left);
        list.add(root.val);
        if(right!=null)
            list.addAll(list.size(), right);
        return list;

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
