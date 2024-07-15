package _502;
/*
* mwl 502. IPO
* */


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] arr = new int[profits.length][2];
        for(int i=0; i<profits.length; i++){
            arr[i][0]=profits[i];
            arr[i][1]=capital[i];
        }
        Arrays.sort(arr, (o1, o2) -> o1[1]-o2[1]);

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->o2-o1);

        int index=0;
        for(int i=0; i<k; i++){
            while(index<profits.length && arr[index][1]<=w){
                queue.add(arr[index][0]);
                index++;
            }
            if(!queue.isEmpty())
                w+=queue.poll();
            else
                break;
        }


        return w;
    }
}

public class Main {
}
