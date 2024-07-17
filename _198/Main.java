package _198;
/*
* mwl 198. 打家劫舍
* */

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int[] maxs = new int[nums.length];
        maxs[0]=nums[0];
        maxs[1]=Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            maxs[i]=Math.max(maxs[i-2]+nums[i], maxs[i-1]);
        }

        return maxs[nums.length-1];
    }
}

public class Main {
}
