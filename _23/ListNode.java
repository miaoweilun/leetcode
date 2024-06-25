package _23;

/*
* mwl 合并k个升序列表
* */


import java.util.List;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;

        while(true){

            //遍历lists, 找到最小值的index
            int index = -1;

            for (int i = 0; i < lists.length; i++){
                if (index == -1 && lists[i] != null){
                    index = i;
                    continue;
                }
                if (lists[i] != null && lists[i].val < lists[index].val)
                    index = i;
            }


            if(index == -1)
                break;

            ListNode node = lists[index];

            lists[index] = node.next;
            node.next = null;

            if (result == null){
                result = node;
                continue;
            }

            boolean flag = false;
            ListNode p = result;
            for (; p.next !=null ; p = p.next){
                if(p.next.val > node.val){
                    node.next = p.next;
                    p.next = node;
                    flag = true;
                }
            }

            if(!flag)
                p.next = node;

        }

        return result;
    }
}


public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static void main(String[] args) {
        ListNode[] input = new ListNode[3];
        input[0] = createListNode(new int[]{1,4,5});
        input[1] = createListNode(new int[]{1,3,4});
        input[2] = createListNode(new int[]{2,6});

        printlnNode(input[0]);
        printlnNode(input[1]);
        printlnNode(input[2]);

        ListNode listNode = new Solution().mergeKLists(input);

        printlnNode(listNode);
    }

    public static void printlnNode(ListNode listNode){
        while (listNode != null){
            System.out.print(listNode.val +" -> ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    private static ListNode createListNode(int[] ints) {

        ListNode result = null;
        ListNode p = result;
        for (int i : ints){
            if (result == null){
                result = new ListNode(i);
                p = result;
                continue;
            }
            p.next = new ListNode(i);
            p = p.next;
        }
        return result;
    }
}
