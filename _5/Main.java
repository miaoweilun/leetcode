package _5;
/*
* mwl 5. 最长回文子串
* */

import java.util.*;

class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1)
            return "";

        Map<Character, List<Integer>> map = new HashMap<>();
        char[] chs = s.toCharArray();

        List<Integer> l = new ArrayList<>();
        l.add(0);
        map.put(chs[0], l);

        int maxLength = 1, left=0, right=0;
        for(int i=1; i<chs.length; i++){
            List<Integer> buffer =  map.get(chs[i]);
            if(buffer==null){
                buffer = new ArrayList<>();
                buffer.add(i);
                map.put(chs[i], buffer);
            }else{
                for(int j=0; j<buffer.size(); j++){
                    int begin = buffer.get(j);
                    if(i-begin+1<=maxLength)
                        break;
                    int end=i;
                    while(begin<end && chs[begin]==chs[end]){
                        begin++;
                        end--;
                    }
                    if(begin>=end){
                        maxLength=i-buffer.get(j)+1;
                        left=buffer.get(j);
                        right=i;
                        break;
                    }
                }

                buffer.add(i);
            }
        }
        return s.substring(left, right+1);
    }
}

public class Main {
}
