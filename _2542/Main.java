package _2542;

import java.util.*;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long ans=0L, buffer=0L;
        int length=nums1.length;
        Integer[] ids = new Integer[length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<length; i++)
            ids[i]=i;

        // System.out.println(Arrays.toString(ids));
        Arrays.sort(ids, (o1, o2) -> nums2[o2]-nums2[o1]);

        // System.out.println(Arrays.toString(ids));

        for(int id : ids){
            int x=nums1[id], y=nums2[id];
            if(minHeap.size()<k){
                minHeap.add(x);
                buffer+=(long)x;
                if(minHeap.size()==k && buffer*y>ans){
                    ans=buffer*y;
                }
            }else{
                buffer-=minHeap.poll();
                buffer+=x;
                minHeap.add(x);
                if(buffer*y>ans)
                    ans=buffer*y;
            }
        }


        return ans;
    }
}

public class Main {
}
