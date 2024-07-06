package _45;

/*
* mwl 45. 跳跃游戏 II
* */
class Solution {
    public int jump(int[] nums) {
        int[] minStep=new int[nums.length];
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]+i>=nums.length-1)
                minStep[i]=1;
            else {
                int min=nums.length;
                for(int j=1; j<=nums[i]; j++){
                    if(minStep[i+j]!=0){
                        min=Math.min(min, minStep[i+j]);
                    }
                }
                if(min != nums.length){
                    minStep[i]=1+min;
                }
            }
        }
        return minStep[0];
    }
}
public class Main {
}
