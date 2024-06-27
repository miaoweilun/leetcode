package _199;

/*
* mwl 199. 二叉树的右视图
* */

import _utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        if(root!=null)
            queue.offer(root);

        while(!queue.isEmpty()){
            Queue<TreeNode> queueBuffer = new ArrayDeque<>();
            // 遍历一层
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node.left!=null)
                    queueBuffer.offer(node.left);
                if(node.right!=null)
                    queueBuffer.offer(node.right);
                if(queue.isEmpty())
                    list.add(node.val);
            }
            queue = queueBuffer;
        }

        return list;
    }
}

public class Main {


}
