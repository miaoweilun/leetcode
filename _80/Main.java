package _80;


/*
* mwl 80. 删除有序数组中的重复项 II
* */


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;

        int j=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i]!=nums[j-1] || nums[i]!=nums[j-2]){
                nums[j++]=nums[i];
            }
        }

        return j;
    }
}

public class Main {
}
