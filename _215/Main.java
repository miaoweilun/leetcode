package _215;

/*
* mwl 215. 数组中的第K个最大元素
* */
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->o2-o1);

        for(int num : nums)
            queue.add(num);

        int result=0;
        for(int i=0; i<k; i++){
            result = queue.poll();
        }

        return result;
    }
}

public class Main {
}
