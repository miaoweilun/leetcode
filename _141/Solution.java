package _141;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;


    }
}
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
    }
}
