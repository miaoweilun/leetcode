package _6;

/*
* mwl 6. Z 字形变换
* */

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        int group = numRows*2 - 2;
        StringBuilder ans=new StringBuilder();
        StringBuilder[] buffer = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            buffer[i] = new StringBuilder();
        }
        char[] chs = s.toCharArray();

        for(int i=0; i<chs.length; i++){
            int yu = i%group;
            if(yu<numRows)
                buffer[yu].append(chs[i]);
            else
                buffer[group-yu].append(chs[i]);
        }

        for(StringBuilder builder : buffer){
            ans.append(builder);
        }

        return ans.toString();
    }
}

public class Main {
}
