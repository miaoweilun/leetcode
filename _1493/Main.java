package _1493;
/*
* mwl 1493. 删掉一个元素以后全为 1 的最长子数组
* */

class Solution {
    public int longestSubarray(int[] nums) {
        boolean has0 = false;
        int left=0, ans=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                if(has0){
                    int length = i-left-1;
                    if(length>ans)
                        ans=length;
                    while(nums[left++]!=0);
                }else{
                    has0=true;
                }
            }
        }
        int length = nums.length-left-1;
        if(ans<length)
            ans=length;

        return ans;
    }
}

public class Main {
}
