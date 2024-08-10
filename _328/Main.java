package _328;
// 328. 奇偶链表

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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode head1=head, head2=head.next, p=head.next.next, tail1=head, tail2=head.next;
        boolean flag=true;

        head1.next=null;
        head2.next=null;

        while(p!=null){
            ListNode node=p;
            p=p.next;
            node.next=null;
            if(flag){
                tail1.next=node;
                tail1=tail1.next;
            }else{
                tail2.next=node;
                tail2=tail2.next;
            }
            flag=!flag;
        }

        tail1.next=head2;

        return head1;
    }
}
public class Main {
}
