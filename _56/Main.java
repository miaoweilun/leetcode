package _56;
/*
* mwl 56. 合并区间
* */

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0]-o2[0]);

        List<int[]> list = new ArrayList<>();

        list.add(intervals[0]);

        for(int i=1; i<intervals.length; i++){
            int[] buffer = list.get(list.size()-1);
            if(buffer[1]>=intervals[i][0]){
                if(buffer[1]<intervals[i][1]){
                    list.remove(list.size()-1);
                    list.add(new int[]{buffer[0], intervals[i][1]});
                }
            }else{
                list.add(intervals[i]);
            }
        }


        return list.toArray(new int[list.size()][]);
    }
}

/*

当然抛开前面的集合转为数组的方法，list.toArray(new String[0]) 中 new String[0]什么意思，为什么要写new String[0] 不写0可以写别的吗？

经过查阅资料发现：在将List转换为数组时，传入new String[0]参数是为了告诉JVM这个toArray的返回结果是一个String数组。
这种方式更加高效，因为如果传入的数组长度不够，数组会被重新生成，而使用0长度的数组，则可以避免这种情况，同时也不会浪费内存空间。

* */

public class Main {
}
