package _134;
/*
* mwl 134. 加油站
* */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int[] profit = new int[length];
        for(int i=0; i<length; i++){
            profit[i]=gas[i]-cost[i];
        }

        for(int i=0; i<length;){
            if(profit[i]>=0){
                int index = i+1>=length ? 0:i+1, count=profit[i];
                while(index!=i){
                    count+=profit[index];
                    if(count<0){
                        break;
                    }
                    if(++index>=length)
                        index=0;
                }
                if(index==i)
                    return i;
                if(index<i)
                    return -1;
                i=index+1;
            }else{
                i++;
            }
        }

        return -1;
    }
}

public class Main {
}
