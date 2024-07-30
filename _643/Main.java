package _643;
/*
* mwl 643. 子数组最大平均数 I
* */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;

        double max = 0.0;
        for(int i=0; i<k; i++)
            max += 1.0*nums[i];
        double s=max;

        for(int i=k; i<nums.length; i++){
            s+=nums[i]-nums[left];
            if(s>max)
                max=s;
            left++;
        }

        return max/k;
    }
}
public class Main {
}
