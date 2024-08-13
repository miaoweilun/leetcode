package _2130;

//2130. 链表最大孪生和

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
    public int pairSum(ListNode head) {
        int length=0, max=Integer.MIN_VALUE;
        ListNode pre=new ListNode(), next=head;

        for(ListNode p=head; p!=null; p=p.next)
            length++;

        for(int i=0; i<length/2; i++){
            pre.next= new ListNode(next.val, pre.next);
            next=next.next;
        }

        pre=pre.next;
        while(next!=null){
            int value=pre.val+next.val;
            if(value>max)
                max=value;
            pre=pre.next;
            next=next.next;
        }

        return max;
    }
}

public class Main {
}
