package _92;

/*
* mwl 翻转链表
* */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead = new ListNode(0, head);
        ListNode preHead = newHead;
        for(int i=1; i<left; i++){
            preHead = preHead.next;
            head=head.next;
        }

        for(int i=left; i<right; i++)
            head=head.next;

        ListNode node = preHead.next;
        preHead.next = head.next;
        head.next=null;

        while(node!=null){
            ListNode buffer = node;
            node=node.next;
            buffer.next=preHead.next;
            preHead.next = buffer;
        }


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
