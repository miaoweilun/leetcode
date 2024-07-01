package _77;

/*
* mwl 77. 组合
* */

import java.util.*;

class Solution {

    public List<List<Integer>> combine(int n, int k) {
        Queue<List<Integer>> queue = new LinkedList<>();

        for(int i=1; i<n-k+2; i++){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            queue.offer(list);
        }

        for(int i=1; i<k; i++){
            Queue<List<Integer>> queueNext = new LinkedList<>();
            while(!queue.isEmpty()){
                List<Integer> buffer = queue.poll();
                for(int j=buffer.get(buffer.size()-1)+1; j<=n; j++){
                    List<Integer> list = new ArrayList<>(buffer);
                    list.add(j);
                    queueNext.offer(list);
                }
            }
            queue=queueNext;
        }

        return new ArrayList<>(queue);
    }
}

public class Main {
}
