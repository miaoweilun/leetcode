package _138;

/*
* mwl 随机链表的复制
* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Integer> map = new HashMap<>();

        Node node = new Node(0);
        Node result = node;
        List<Node> list = new ArrayList<>();

        int i=0;
        for(Node p=head; p!=null; p=p.next){
            map.put(p, i);
            node.next = new Node(p.val);
            node = node.next;
            list.add(node);
            i++;
        }

        i=0;
        for(Node p=head, q=result.next; p!=null; p=p.next, q=q.next){
            if(p.random != null){
                int index = map.get(p.random);
                q.random = list.get(index);
            }
            i++;
        }
        return result.next;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Main {
}
