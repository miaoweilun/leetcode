package _128;


/*
* mwl 128. 最长连续序列
* */


import java.util.PriorityQueue;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=0)
            return 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(nums.length);

        for (int num : nums) {
            queue.add(num);
        }

        int count = 1;
        int lastBuffer = queue.peek();
        int maxCount = 1;
        while(!queue.isEmpty()){

            int buffer = queue.poll();
            if (buffer - lastBuffer > 1){
                if(maxCount < count)
                    maxCount = count;
                count = 1;
            }else if(buffer - lastBuffer == 1){
                count++;
            }
            lastBuffer = buffer;
        }

        return Math.max(maxCount, count);
    }
}

public class Main {
}
