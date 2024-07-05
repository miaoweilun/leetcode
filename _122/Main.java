package _122;
/*
* mwl 122. 买卖股票的最佳时机 II
* */

class Solution {
    public int maxProfit(int[] prices) {

        //在低谷买入，高峰卖出
        int buyIndex=-1, profit=0;
        for(int i=0; i<prices.length; i++){
            // 判断是不是买入点
            if(i!=prices.length-1 && prices[i+1]-prices[i]>0 && (i==0 || prices[i]-prices[i-1]<=0)){
                buyIndex=i;
            }
            // 判断是不是卖出点
            else if(i!=0 && prices[i]-prices[i-1]>0 &&(i==prices.length-1 || prices[i+1]-prices[i]<=0)){
                profit+=prices[i]-prices[buyIndex];
            }
        }

        return profit;
    }
}
public class Main {
}
