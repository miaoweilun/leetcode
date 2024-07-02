package _167;
/*
* mwl 167. 两数之和 II - 输入有序数组
* */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        ans[0]=0;
        ans[1]=numbers.length-1;

        int sum=numbers[ans[0]]+numbers[ans[1]];
        while(sum!=target && ans[0]<ans[1]){
            if(sum>target){
                ans[1]--;
            }else{
                ans[0]++;
            }
            sum=numbers[ans[0]]+numbers[ans[1]];
        }
        ans[0]++;
        ans[1]++;

        return ans;
    }
}

public class Main {
}
