package _2462;

import java.util.PriorityQueue;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int num=costs.length, left=candidates-1, right=costs.length-candidates;
        long ans=0L;

        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> {
            if(costs[o1] != costs[o2])
                return costs[o1]-costs[o2];
            return o1-o2;
        });

        if(candidates*2<num){
            for(int i=0; i<=left; i++){
                heap.add(i);
            }
            for(int i=right; i<num; i++){
                heap.add(i);
            }
        }else{
            for(int i=0; i<num; i++){
                heap.add(i);
            }
        }


        for(int i=0; i<k; i++){
            int index=heap.poll();
            ans+=(long)costs[index];
            num--;

            if(num>=2*candidates){
                if(index<=left){
                    heap.add(++left);
                }else{
                    heap.add(--right);
                }
            }
            // System.out.println(costs[index] + " " + index + " " + left + " : " + right + " " + ans);
        }

        return ans;
    }
}
// [50,80,34,9,86,20,67,94,65,82,40,79,
//  74,         92,     84,37,19,16,        85,      20,            79,         25,
//  89,55,67,84,3,79,38,16,44,2,54,58]

public class Main {
}
