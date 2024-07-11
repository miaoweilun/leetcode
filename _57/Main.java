package _57;
/*
* mwl 57. 插入区间
* */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        boolean finish=false;
        for(int i=0; i<intervals.length; i++){
            // 在右侧
            if(finish || intervals[i][1]<newInterval[0]){
                list.add(intervals[i]);
            }
            // 在左侧
            else if(newInterval[1]<intervals[i][0]){
                list.add(newInterval);
                list.add(intervals[i]);
                finish=true;
            }
            // 有交集
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        if(!finish){
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][]);
    }
}

public class Main {
}
