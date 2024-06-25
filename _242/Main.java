package _242;
/*
* mwl 有效字母异位词
* */

class Solution {
    public boolean isAnagram(String s, String t) {
        int[][] chs = new int[2][26];

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        if(ss.length != tt.length)
            return false;

        for(int i=0; i<ss.length; i++){
            chs[0][ss[i] - 'a']++;
            chs[1][tt[i] - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(chs[0][i] != chs[1][i])
                return false;
        }

        return true;
    }
}

public class Main {

}
