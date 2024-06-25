package _21;

/*

mwl 合并两个有序的链表
* */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node = new ListNode();
        ListNode result = node;

        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                node.next = list2;
                list2 = list2.next;
                node = node.next;
                node.next = null;
            }else{
                node.next = list1;
                list1 = list1.next;
                node = node.next;
                node.next = null;
            }
        }

        if(list1!=null)
            node.next = list1;
        if(list2 != null)
            node.next = list2;

        return result.next;
    }
}

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {

    }
}
