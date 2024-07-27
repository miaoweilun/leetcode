package _334;
/*
* mwl 334. 递增的三元子序列
* */

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;

        boolean[] left = new boolean[nums.length], right = new boolean[nums.length];
        int min=nums[0], max = nums[nums.length-1];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>min){
                left[i]=true;
            }else if(nums[i]<min){
                min=nums[i];
            }
        }

        for(int j=nums.length-2; j>=0; j--){
            if(nums[j]<max){
                if(left[j])
                    return true;
                right[j]=true;
            }else if(nums[j]>max){
                max=nums[j];
            }
        }
        return false;
    }
}

public class Main {
}
