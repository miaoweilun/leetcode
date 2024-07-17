package _136;
/*
* mwl 136. 只出现一次的数字
* */

class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}

public class Main {
}
