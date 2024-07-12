package _637;
/*
* mwl 637. 二叉树的层平均值
* */

import _utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        if(root!=null)
            queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0.0;
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                sum+=node.val;
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            ans.add(sum/size);
        }

        return ans;
    }
}

public class Main {
}
