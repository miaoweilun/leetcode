package _26;

//mwl 26. 删除有序数组中的重复项

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int j=0;

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[j++]=nums[i];
            }
        }

        return j;
    }
}

public class Main {
}
