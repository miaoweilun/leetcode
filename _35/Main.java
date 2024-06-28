package _35;
/*
* mwl 二分查找
* */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int begin=0, end=nums.length-1;

        while(begin<end){
            int mid = (begin+end)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target){
                end=mid-1;
            }else{
                begin=mid+1;
            }
        }
        if(nums[begin]<target)
            return begin+1;
        return begin;
    }
}
public class Main {
}
