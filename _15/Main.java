package _15;
/*
* mwl 两数之和
* */

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3)
            return result;

        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }



        for (int i=0; i< nums.length - 2; i++){
            if(i!=0 && nums[i] == nums[i-1])
                continue;
            for (int j=i+1; j<nums.length - 1; j++){
                if(j!=i+1 && nums[j] == nums[j-1])
                    continue;
                // for(int k=j+1; k<nums.length; k++){
                //     if(nums[i]+nums[j]+nums[k] == 0){
                //         result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                //         break;
                //     }
                // }
                int buffer = -nums[i]-nums[j];
                if(set.contains(buffer)  && buffer>=nums[j] ){
                    result.add(Arrays.asList(nums[i], nums[j], buffer));
                }
            }
        }

        return result;
    }
}
public class Main {

    public static void main(String[] args) {
        new Solution().threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
