package _106;

import _utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private Map<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();

        int length = inorder.length;

        for(int i=0; i<length; i++)
            map.put(inorder[i], i);

        return buildNode(inorder, postorder, 0, length-1, 0, length-1);
    }

    TreeNode buildNode(int[] inorder, int[] postorder, int inLeft, int inRight, int postLeft, int postRight){

        if(inLeft > inRight || postLeft > postRight)
            return null;


        int rootPostIndex = postRight;
        int rootInIndex = this.map.get(postorder[postRight]);

        TreeNode root = new TreeNode(postorder[postRight]);

        int count = rootInIndex - inLeft;

        root.left = buildNode(inorder, postorder, inLeft, rootInIndex-1, postLeft, postLeft + count -1);
        root.right = buildNode(inorder, postorder, rootInIndex+1, inRight, postLeft + count, postRight -1);


        return root;

    }
}
public class _106 {

}
