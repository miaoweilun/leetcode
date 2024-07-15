package _373;
/*
* mwl 373. 查找和最小的 K 对数字
* */

import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int index1=0, index2=0;

        PriorityQueue<List<Integer>> queue = new PriorityQueue<>((o1, o2)->nums1[o1.get(0)]+nums2[o1.get(1)]-nums1[o2.get(0)]-nums2[o2.get(1)]);
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        queue.add(a);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<k; i++){
            List<Integer> indexs = queue.poll();
            // System.out.println(indexs.get(0) + " : " + indexs.get(1));

            ans.add(Arrays.asList(nums1[indexs.get(0)], nums2[indexs.get(1)]));
            if(indexs.get(0)+1 < nums1.length){
                List<Integer> buffer = new ArrayList<>();
                buffer.add(indexs.get(0)+1);
                buffer.add(indexs.get(1));
                if(!set.contains(buffer)){
                    set.add(buffer);
                    queue.add(buffer);
                }
            }
            if(indexs.get(1)+1 < nums2.length){
                List<Integer> buffer = new ArrayList<>();
                buffer.add(indexs.get(0));
                buffer.add(indexs.get(1)+1);
                if(!set.contains(buffer)){
                    set.add(buffer);
                    queue.add(buffer);
                }
            }
        }
        return ans;
    }
}

public class Main {
}
