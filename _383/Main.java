package _383;
/*
* mwl 赎金信
* */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            String cc = String.valueOf(c);
//            if(map.get(cc) != null){
//                map.put(cc, map.get(cc)+1);
//            }else{
//                map.put(cc, 1);
//            }
            map.merge(cc, 1, Integer::sum);
        }

        for(char c : ransomNote.toCharArray()){
            String cc = String.valueOf(c);
            Integer result = map.get(cc);
            if(result == null || result < 1)
                return false;
            map.put(cc, result-1);
        }

        return true;

    }
}

public class Main {
}
