package _177;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new ArrayDeque<>();

        if(root != null)
            queue.offer(root);

        while(!queue.isEmpty()){
            // 遍历一层
            Node lastNode = null;
            Queue<Node> queue1 = new ArrayDeque<>();
            while(!queue.isEmpty()){
                Node nowNode = queue.poll();
                if(lastNode != null)
                    lastNode.next = nowNode;
                lastNode = nowNode;
                if(nowNode.left != null)
                    queue1.offer(nowNode.left);
                if(nowNode.right != null)
                    queue1.offer(nowNode.right);
            }
            queue = queue1;

        }

        return root;
    }
}

public class _117 {
}
