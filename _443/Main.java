package _443;
/*
* mwl 443. 压缩字符串
* */

class Solution {
    public int compress(char[] chars) {
        if(chars.length<1)
            return 0;

        int count=1, j=0;

        for(int i=1; i<chars.length; i++){
            if(chars[i]==chars[j]){
                count++;
            }else{
                if(count>1){
                    char[] sCount = String.valueOf(count).toCharArray();
                    for(char ch : sCount){
                        chars[++j] = ch;
                    }
                    count=1;
                }
                chars[++j] = chars[i];
            }
        }
        if(count>1){
            char[] sCount = String.valueOf(count).toCharArray();
            for(char ch : sCount){
                chars[++j] = ch;
            }
        }

        return j+1;
    }
}

public class Main {
}
