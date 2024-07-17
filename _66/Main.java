package _66;

import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> ans = new LinkedList<>();

        int up = 1;
        for(int i=digits.length-1; i>=0; i--){
            int s = up+digits[i];
            if(s>9){
                ans.addFirst(s%10);
                up=1;
            }else{
                ans.addFirst(s);
                up=0;
            }

        }

        if(up==1)
            ans.addFirst(1);

        int[] ans1 = new int[ans.size()];
        int index=0;
        for(Integer i : ans){
            ans1[index++]=i;
        }


        return ans1;
    }
}

public class Main {
}
