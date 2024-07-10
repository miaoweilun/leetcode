package _392;
/*
* mwl 392. 判断子序列
* */
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(""))
            return true;

        int index=0, length=s.length();
        char[] ch = t.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(s.charAt(index) == ch[i]){
                index++;
                if(index == length)
                    return true;
            }
        }
        return false;
    }
}

public class Main {
}
