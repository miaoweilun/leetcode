package _11;
/*
*
* mwl 盛最多水的容器
* */

class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{2,3,4,5,18,17,6}));
    }
}
