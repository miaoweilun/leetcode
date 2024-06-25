package _61;
/*
* mwl 旋转链表
* */

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next == null)
            return head;
        ListNode newHead = new ListNode(0, head);
        ListNode preNode = newHead, node = newHead;
        int count = 0;
        for(int i=0; i<k && node!=null; i++){
            node = node.next;
            count++;
        }
        if(node == null){
            count--;
            k = k%count;
            node=newHead;
            for(int i=0; i<k; i++)
                node = node.next;
        }
        while(node.next != null){
            node = node.next;
            preNode = preNode.next;
        }

        if(preNode == newHead && node.next == null)
            return head;

        node.next = newHead.next;
        newHead.next = preNode.next;
        preNode.next = null;

        return newHead.next;
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
