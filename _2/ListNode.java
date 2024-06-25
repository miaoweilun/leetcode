package _2;
/*
*
* mwl 两数相加
* */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0, null);
        ListNode p = result;

        int last = 0;
        int buffer = 0;
        while(l1!=null && l2 !=null){

            buffer = last + l1.val + l2.val;
            result.next = new ListNode(buffer%10);
            last = buffer/10;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            buffer = last + l1.val;
            result.next = new ListNode(buffer%10);
            last = buffer/10;
            result = result.next;
            l1 = l1.next;
        }

        while(l2!=null){
            buffer = last + l2.val;
            result.next = new ListNode(buffer%10);
            last = buffer/10;
            result = result.next;
            l2 = l2.next;
        }

        if(last != 0)
            result.next = new ListNode(last);

        return p.next;
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
