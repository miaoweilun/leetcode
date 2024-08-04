package _2352;
//mwl 2352. 相等行列对

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        int length = grid.length, ans=0;
        for(int i=0; i<length; i++){
            StringBuilder builder1 = new StringBuilder(), builder2 = new StringBuilder();
            for(int j=0; j<length; j++){
                builder1.append(grid[i][j]);
                builder2.append(grid[j][i]);
                builder1.append(" ");
                builder2.append(" ");
            }
            map1.merge(builder1.toString(), 1, Integer::sum);
            map2.merge(builder2.toString(), 1, Integer::sum);
        }

        // for(Map.Entry<String, Integer> entry : map1.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // System.out.println();
        // for(Map.Entry<String, Integer> entry : map2.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            Integer num = map2.get(entry.getKey());
            if(num!=null){
                ans += num*entry.getValue();
            }
        }

        return ans;
    }
}
public class Main {
}
