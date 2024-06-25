package _105;


import _utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.map = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);


        return buildNode(preorder, inorder, 0, preorder.length-1, 0, preorder.length-1);
    }

    public TreeNode buildNode(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight){

        if(preLeft > preRight || inLeft > inRight)
            return null;

        //找到根节点下标
        int rootPre = preLeft;
        int rootIn = map.get(preorder[preLeft]);

        TreeNode root = new TreeNode(preorder[preLeft]);

        // 统计左子树有多少个节点
        int count = rootIn - inLeft;

        root.left = buildNode(preorder, inorder, preLeft+1, preLeft+count, inLeft, inLeft+count-1);
        root.right = buildNode(preorder, inorder, preLeft+count+1, preRight, inLeft+count+1, inRight);

        return root;
    }

}

public class Main {
    public static void main(String[] args) {

    }
}
