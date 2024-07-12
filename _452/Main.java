package _452;
/*
* mwl 452. 用最少数量的箭引爆气球
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[0]-o2[0]==0 ? o1[1]-o2[1]:o1[0]-o2[0]);

        List<int[]> list = new ArrayList<>();

        // for(int[] point : points)
        //     System.out.println(point[0] + " = "+point[1]);

        for(int i=0; i<points.length; i++){
            int j=0;
            for(; j<list.size(); j++){
                int[] buffer = list.get(j);
                if(points[i][0]>buffer[1] || points[i][1]<buffer[0]){
                    continue;
                }
                buffer[0]=Math.max(buffer[0], points[i][0]);
                buffer[1]=Math.min(buffer[1], points[i][1]);
                // System.out.println(buffer[0]+ " : "+buffer[1]);
                list.add(j, buffer);
                list.remove(j+1);
                break;
            }
            if(j==list.size()){
                // System.out.println(points[i][0]+ " : "+points[i][1]);
                list.add(points[i]);
            }
        }

        return list.size();
    }
}


public class Main {
}
