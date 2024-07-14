package _34;


/*
* mwl 34. 在排序数组中查找元素的第一个和最后一个位置
* */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= new int[2];
        ans[0]=-1;
        ans[1]=-1;

        int i=0, j=nums.length-1;

        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                ans[1]=mid;
                while(ans[1]<nums.length && nums[ans[1]]==target)
                    ans[1]++;
                ans[1]--;
                while(ans[0]>=0 && nums[ans[0]]==target)
                    ans[0]--;
                ans[0]++;
                break;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }

        return ans;
    }
}

public class Main {
}
