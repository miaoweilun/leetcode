package _901;

import java.util.ArrayList;
import java.util.List;

class StockSpanner {

    List<Integer> prices;
    List<Integer> ans;
    int size;

    public StockSpanner() {
        prices = new ArrayList<>();
        ans = new ArrayList<>();
        size = 0;
    }

    public int next(int price) {
        int count=-1;

        for(int i=size-1; i>=0; ){
            if(prices.get(i)>price){
                count=size-i;
                break;
            }else {
                i -= ans.get(i);
            }
        }
        if(count==-1)
            count=size+1;

        prices.add(price);
        size++;
        ans.add(count);

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

public class Main {
}
