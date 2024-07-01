package _228;
/*
* mwl 228. 汇总区间
* */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length < 1)
            return ans;
        int beginIndex = 0, endIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]+1){
                if(beginIndex==endIndex){
                    ans.add(String.valueOf(nums[beginIndex]));
                }else{
                    ans.add(nums[beginIndex] + "->" + nums[endIndex]);
                }
                beginIndex = i;
            }
            endIndex=i;
        }

        if(beginIndex==endIndex){
            ans.add(String.valueOf(nums[beginIndex]));
        }else{
            ans.add(nums[beginIndex] + "->" + nums[endIndex]);
        }

        return ans;
    }
}

public class Main {
}
