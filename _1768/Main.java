package _1768;
/*
* mwl 1768. 交替合并字符串
* */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        StringBuilder ans = new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            ans.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            ans.append(word2.charAt(j++));
        }

        return ans.toString();
    }
}

public class Main {
}
