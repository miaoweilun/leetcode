package _121;

/*
* mwl 121. 买卖股票的最佳时机
* */

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit=0;

        for(int i=1; i<prices.length; i++){
            int count=prices[i]-min;
            if(count>profit)
                profit=count;
            if(prices[i]<min)
                min=prices[i];
        }

        return profit;
    }
}

public class Main {
}
