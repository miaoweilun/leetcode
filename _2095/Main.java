package _2095;

import _utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode newHead = new ListNode(0, head);
        ListNode p=newHead;
        int length=0;

        while(p.next!=null){
            length++;
            p=p.next;
        }

        p=newHead;
        if(length%2==0)
            length = (int)Math.ceil(length/2.0);
        else
            length = length/2;

        for(int i=0; i<length; i++){
            p=p.next;
        }

        ListNode q=p.next;
        if(q.next==null)
            p.next=null;
        else{
            p.next=q.next;
            q.next=null;
        }


        return newHead.next;
    }
}

public class Main {
}
