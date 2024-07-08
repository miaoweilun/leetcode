package _238;
/*
* mwl 238. 除自身以外数组的乘积
* */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length], right = new int[nums.length];
        ans[0]=1;
        right[nums.length-1]=1;
        for(int i=1; i<nums.length; i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            right[i]=right[i+1]*nums[i+1];
            ans[i]*=right[i];
        }

        return ans;

    }
}

public class Main {
}
