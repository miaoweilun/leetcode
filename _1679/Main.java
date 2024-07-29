package _1679;


import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans=0;
        for(int num : nums){
            map.merge(num, 1, Integer::sum);
        }

        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        for(int num : nums){
            Integer aCount = map.get(num);
            Integer bCount = null;
            if(num!=k-num)
                bCount = map.get(k-num);
            else
                bCount = aCount;
            if(aCount!=null && bCount!=null){
                if(num==k-num){
                    int times = aCount/2;
                    ans += times;
                    map.remove(num);
                }else{
                    int times = Math.min(aCount, bCount);
                    ans+=times;
                    map.remove(num);
                    map.remove(k-num);
                }
            }
        }

        return ans;
    }
}
public class Main {
}
