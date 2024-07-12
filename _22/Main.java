package _22;

/*
* mwl 22. 括号生成
* */

import java.util.*;

class Solution {

    private List<String> ans;

    public void put(int n, int left, int index, int[] counts){
        if(left==0){
            StringBuilder builder = new StringBuilder();
            for(int count : counts){
                builder.append('(');
                builder.append(")".repeat(Math.max(0, count)));
            }
            ans.add(builder.toString());
        }else{
            for(int i=index; i<n; i++){
                counts[i]++;

                int sum = 0;
                for(int j=0; j<=i; j++)
                    sum+=counts[j];
                if(sum<=i+1){
                    put(n, left-1, i, counts);
                }

                counts[i]--;
            }
        }
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();

        if(n<1)
            return ans;

        int[] counts = new int[n];

        put(n, n, 0, counts);

        return ans;
    }
}

public class Main {
}
