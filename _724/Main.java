package _724;
/*
* 724. 寻找数组的中心下标
* */

class Solution {
    public int pivotIndex(int[] nums) {
        int[] right = new int[nums.length];
        for(int i=nums.length-2; i>=0; i--){
            right[i] = right[i+1]+nums[i+1];
        }

        int count=0;
        if(right[0]==0)
            return 0;
        for(int i=1; i<nums.length; i++){
            count+=nums[i-1];
            if(count==right[i])
                return i;
        }

        return -1;
    }
}
public class Main {
}
