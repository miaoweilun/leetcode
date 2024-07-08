package _135;
/*
* mwl 135. 分发糖果
* */


class Solution {
    public int candy(int[] ratings) {
        int length = ratings.length, count=0;
        int[] left = new int[length], ans = new int[length];

        for(int i=0; i<length; i++){
            if(i!=0 && ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }else
                left[i]=1;
            // System.out.println(left[i]);
        }

        for(int i=length-1; i>=0; i--){
            if(i!=length-1 && ratings[i]>ratings[i+1]){
                ans[i]=Math.max(ans[i+1]+1, left[i]);
            }else{
                ans[i]=Math.max(1, left[i]);
            }
            count+=ans[i];
        }

        return count;
    }
}

public class Main {
}
