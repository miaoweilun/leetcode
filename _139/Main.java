package _139;
/*
* mwl 139. 单词拆分
* */

import java.util.*;

class Solution {

    Set<String> set;

    public boolean find(StringBuilder builder, String s, List<String> wordDict){
        String ss = builder.toString();

        if(ss.equals(s))
            return true;

        if(ss.length()>s.length() || set.contains(ss))
            return false;

        set.add(ss);

        if(!s.substring(0, ss.length()).equals(ss))
            return false;
        System.out.println(builder.toString());
        for(String word : wordDict){
            StringBuilder newBuilder = new StringBuilder(builder);
            newBuilder.append(word);

            // ;
            if(find(newBuilder, s, wordDict))
                return true;
        }
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>();

        StringBuilder builder = new StringBuilder();
        return find(builder, s, wordDict);
    }
}

public class Main {

    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = new String[]{
                "leet", "code"
        };

        List<String> list = new ArrayList<>(List.of(wordDict));

        System.out.println(new Solution().wordBreak(s, list));

    }
}
