package _82;
/*
* mwl 删除排序链表中的重复元素 II
* */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode newHead = new ListNode(0, head);
        ListNode preNode = newHead, node = head;
        while(node!=null && node.next != null){
            if(node.val == node.next.val){
                // 循环删除重复节点
                while(node.next !=null && node.val == node.next.val)
                    node = node.next;
                preNode.next = node.next;
                node.next = null;
                node = preNode.next;
            }else{
                node = node.next;
                preNode = preNode.next;
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
