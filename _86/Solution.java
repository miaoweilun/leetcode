package _86;
/*
* mwl 分隔链表
* */

import _utils.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode newHead = new ListNode(0, head), bigger = new ListNode(), node = newHead, tail = bigger;

        while(node.next != null){
            if(node.next.val >= x){
                ListNode buffer = node.next;
                node.next = buffer.next;
                buffer.next = null;

                tail.next = buffer;
                tail = buffer;
            }else{
                node = node.next;
            }
        }

        node.next = bigger.next;
        bigger.next = null;

        return newHead.next;
    }
}
