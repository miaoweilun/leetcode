package _19;

/*
*
* mwl 删除链表的倒数第 N 个结点
* */


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0, head);
        ListNode p = newHead, preNode = newHead;
        for(int i=0; i<n; i++)
            p=p.next;
        while(p.next!=null){
            preNode = preNode.next;
            p = p.next;
        }

        ListNode buffer = preNode.next;
        preNode.next = preNode.next.next;
        buffer.next = null;

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
