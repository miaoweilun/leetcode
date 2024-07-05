package _55;
/*
* mwl 55. 跳跃游戏
* */
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2)
            return true;


        boolean[] step = new boolean[nums.length];
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]+i>=nums.length-1){
                step[i]=true;
                continue;
            }
            for(int j=1; j<=nums[i]; j++){
                if(step[i + j]){
                    step[i]=true;
                    break;
                }
            }
        }

        return step[0];
    }
}

public class Main {
}
