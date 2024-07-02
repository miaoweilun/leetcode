package _3;
/*
* mwl 3. 无重复字符的最长子串
* */

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chs = s.toCharArray();

        if(chs.length<1)
            return 0;
        map.put(chs[0], 0);
        int max=1, begin=0, end=0;
        while(end+1<chs.length){
            end++;
            Integer index = map.get(chs[end]);
            if(index==null){
                // System.out.println(begin + " : "+ end);
                max=Math.max(end-begin+1, max);

                map.put(chs[end], end);
            }else{
                for(int i=begin; i<index; i++)
                    map.remove(chs[i]);
                begin=index+1;
                map.put(chs[end], end);
            }
        }


        return max;
    }
}

public class Main {
}
