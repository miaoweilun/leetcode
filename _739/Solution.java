package _739;

import java.util.Arrays;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-2; i>=0; i--){
            for(int j=i+1; j<temperatures.length; ){
                if(temperatures[i]<temperatures[j]){
                    ans[i]=j-i;
                    break;
                }else if(ans[j]!=0){
                    j=j+ans[j];
                }else{
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(ints));
    }
}

