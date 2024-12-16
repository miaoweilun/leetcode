package _435;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, ((o1, o2) -> o1[0]==o2[0] ? o1[1]-o2[1] : o1[0]-o2[0]));
        int index=0, ans=0;

        List<int[]> indexes = new ArrayList<>();
        indexes.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<intervals[index][1]){
                // 判断舍弃index还是i
                if(intervals[index][1]>=intervals[i][1]){
                    index=i;
                    ans++;
                    indexes.remove(indexes.size()-1);
                    indexes.add(intervals[i]);
                }else{
                    ans++;
                }
            }else{
                index=i;
                indexes.add(intervals[i]);
            }
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        int[][] intervals = {{0,2}, {1,3},{2,4},{3,5},{4,6}};

        System.out.println(new Solution().eraseOverlapIntervals(intervals));
    }
}
