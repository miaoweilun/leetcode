package _300;
/*
* mwl 300. 最长递增子序列
* */

import java.util.Iterator;
import java.util.PriorityQueue;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] count = new int[nums.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> count[o2]-count[o1]);

        count[0]=1;
        queue.add(0);
        for(int i=1; i<nums.length; i++){
            int index = queue.peek();

        }

        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2-o1);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(12);
        priorityQueue.add(132);

        for (Integer num : priorityQueue) {
            System.out.println(num);
        }
    }
}
