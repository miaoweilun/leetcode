package _322;
/*
* mwl 322. 零钱兑换
* */


import java.util.*;

class Solution {


    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;

        int[] counts = new int[amount];

        for(int coin : coins){
            if(coin <= amount)
                counts[coin-1] = 1;
        }

        for(int i=0; i<amount; i++){
            if(counts[i]==0){
                int min = Integer.MAX_VALUE;
                boolean flag=false;
                for(int coin : coins){
                    if(i-coin>=0 && counts[i-coin]!=0 && min>counts[i-coin]){
                        flag=true;

                        min=counts[i-coin];
                    }
                }
                if(flag)
                    counts[i]=1+min;
            }
        }
        // System.out.print(Arrays.toString(counts));
        // set = new HashSet<>();
        return counts[amount-1] == 0 ? -1:counts[amount-1];
    }
}

public class Main {
}
