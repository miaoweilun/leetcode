package _utils;


import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Stack<int[]> ans = new Stack<>();

//        Arrays.sort(points, ((o1, o2) -> o1[0]==o2[0] ? o1[1]-o2[1] : o1[0]-o2[0]));

        Arrays.sort(points, (o1, o2) -> {
            int cmp = Integer.compare(o1[0], o2[0]);
            return (cmp != 0) ? cmp : Integer.compare(o1[1], o2[1]);
        });

        ans.add(points[0]);

        for (int i = 1; i < points.length; i++) {
            int[] peek = ans.peek();
            if(points[i][0]>peek[1]){
                ans.add(points[i]);
            }else{
                ans.pop();
                ans.add(new int[]{points[i][0], Math.min(peek[1], points[i][1]) });
            }
        }

        return ans.size();
    }
}

public class Test {
    public static void main(String[] args) {

        int[][] points = {
//                {10,16},{2,8},{1,6},{7,12}
//                {-2147483646,-2147483645}, {2147483646,2147483647}
                {9,12},{1,10}, {4,11},{8,12},{3,9},{6,9},{6,7}
        };

        System.out.println(new Solution().findMinArrowShots(points));
    }
}
