package _76;

import java.util.*;

/*
* mwl 76. 最小覆盖子串
* */

class Solution {

    Map<Character, Integer> mapA = new HashMap<>(), mapB = new HashMap<>();

    public boolean check(){
        Iterator it = mapA.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if(mapB.getOrDefault(key, 0) < val)
                return false;
        }

        return true;
    }

    public String minWindow(String s, String t) {

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            mapA.put(ch, mapA.getOrDefault(ch, 0)+1);
        }

        int l=0, r=-1, ansL=-1, ansR=-1, len=Integer.MAX_VALUE, sLen=s.length();

        while(r<sLen){
            ++r;
            if(r<sLen && mapA.containsKey(s.charAt(r))){
                mapB.put(s.charAt(r), mapB.getOrDefault(s.charAt(r), 0)+1);
            }
            while(check() && l<=r){
                if(r-l+1<len){
                    len=r-l+1;
                    ansL=l;
                    ansR=l+len;
                }
                if(mapA.containsKey(s.charAt(l))){
                    mapB.put(s.charAt(l), mapB.getOrDefault(s.charAt(l), 0)-1);
                }
                ++l;
            }

        }

        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }
}
public class Main {
}
