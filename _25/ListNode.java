package _25;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(0, head);
        ListNode preNode = newHead;
        int count = 0;
        for(ListNode node=head; node!=null; ){
            count++;
            if(count%k == 0){
                ListNode p=preNode.next;
                preNode.next = node.next;
                node.next=null;

                while(p!=null){
                    ListNode buffer = p;
                    p=p.next;
                    buffer.next=preNode.next;
                    preNode.next=buffer;
                }

                for(int i=0; i<k; i++)
                    preNode=preNode.next;
                node = preNode.next;
            }else{
                node=node.next;
            }
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
