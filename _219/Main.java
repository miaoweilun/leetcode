package _219;
/*
* mwl 存在重复元素
* */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer result = map.get(nums[i]);
            if(result == null || i - result > k)
                map.put(nums[i], i);
            else
                return true;
        }

        return false;
    }
}

public class Main {
}
