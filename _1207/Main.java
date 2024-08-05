package _1207;
// 1207. 独一无二的出现次数

import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
}

public class Main {
}
