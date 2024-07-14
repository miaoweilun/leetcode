package _53;
/*
* mwl 53. 最大子数组和
* */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0], ans=nums[0];

        for(int i=1; i<nums.length; i++){
            // 需要换开头
            if(sum < 0){
                // System.out.println(nums[i]);
                sum=nums[i];
                ans=Math.max(ans,nums[i]);
            }
            else {
                sum+=nums[i];
                ans=Math.max(ans,sum);
            }
        }

        return ans;
    }
}

public class Main {
}
