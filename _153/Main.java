package _153;
/*
* mwl 153. 寻找旋转排序数组中的最小值
* */

class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1, min=nums[0];

        while(i<j){
            int mid = (i+j)/2;
            min = Math.min(min, nums[mid]);
            // 左边单调增
            if(nums[mid]>nums[j]){
                i=mid+1;
            }
            // 右边单调增
            else{
                j=mid-1;
            }
        }

        return Math.min(min, nums[i]);
    }
}

public class Main {
}
