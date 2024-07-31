package _1004;


/*
* mwl 1004. 最大连续1的个数 III
* */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0, count0=0, count1=0, ans=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count1++;
                if(count1>ans)
                    ans=count1;
            }else{
                count0++;
                if(count0>k){
                    while(nums[left++]!=0){
                        count1--;
                    }
                    count0--;
                }else{
                    count1++;
                    if(count1>ans)
                        ans=count1;
                }
            }
            // System.out.println(count1);
        }

        return ans;
    }
}

public class Main {
}
