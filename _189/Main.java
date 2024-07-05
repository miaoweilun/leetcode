package _189;
/*
* mwl 189. 轮转数组
* */

class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        if(k>length)
            k=k%length;

        int[] buffer = new int[k];
        for(int i=0; i<k; i++){
            buffer[i]=nums[length-k+i];
        }

        for(int i=length-1; i>=k; i--){
            nums[i]=nums[i-k];
        }

        for(int i=0; i<k; i++){
            nums[i]=buffer[i];
        }
    }
}

public class Main {
}
