package _42;


/*
*
* mwl 接雨水
* */


import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        int[] leftMaxNum = new int[height.length];
        int[] rightMaxNum = new int[height.length];
        int leftMax = 0;
        int rightMax = 0;

        for (int i = 1; i < height.length; i++) {
            leftMax = Math.max(leftMax, height[i-1]);
            leftMaxNum[i] = leftMax;
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax = Math.max(rightMax, height[i+1]);
            rightMaxNum[i] = Math.max(rightMax, height[i+1]);
        }

//        System.out.println(Arrays.toString(leftMaxNum));
//        System.out.println(Arrays.toString(rightMaxNum));

        int buffer = 0;
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            buffer = Math.min(leftMaxNum[i], rightMaxNum[i]) - height[i];
            if (buffer>0)
                result += buffer;
        }

        return result;
    }
}

public class Main {

    public static void main(String[] args) {
//        System.out.println(new Solution().trap(new int[]{0,7,1,4,6}));

        System.out.println(new Solution().trap(new int[]{4,2,0,3,2,5}));
    }
}
