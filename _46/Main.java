package _46;
/*
* mwl 46. 全排列
* */

import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();

        for (int num : nums) {
            if (queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                queue.offer(list);
            } else {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    List<Integer> list = queue.poll();
                    for (int k = 0; k <= list.size(); k++) {
                        List<Integer> newList = new ArrayList<>(list);
                        newList.add(k, num);
                        queue.offer(newList);
                    }
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
public class Main {
}
