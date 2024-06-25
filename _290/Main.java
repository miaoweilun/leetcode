package _290;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        char[] chs = pattern.toCharArray();
        String[] ss = s.split(" ");

        if(chs.length != ss.length)
            return false;

        for(int i=0; i<chs.length; i++){
            if(map1.get(chs[i]) == null){
                if(map2.get(ss[i]) == null){
                    map1.put(chs[i], ss[i]);
                    map2.put(ss[i], chs[i]);
                }else
                    return false;
            }else if(map2.get(ss[i]) == null || map2.get(ss[i]) != chs[i])
                return false;
        }

        return true;

    }
}

public class Main {
}
