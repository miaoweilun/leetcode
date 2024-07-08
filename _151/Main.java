package _151;

/*
* mwl 151. 反转字符串中的单词
* */

class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder(), buffer = null;
        char[] ss = s.toCharArray();

        for(char ch : ss){
            if(buffer == null){
                if(ch != ' '){
                    buffer=new StringBuilder();
                    buffer.append(ch);
                }
            }else if(ch != ' '){
                buffer.append(ch);
            }else{
                if(ans.length() != 0 ){
                    ans.insert(0, ' ');
                }
                ans.insert(0, buffer);
                buffer=null;
            }
        }
        if(buffer!=null){
            if(ans.length() != 0 ){
                ans.insert(0, ' ');
            }
            ans.insert(0, buffer);
            buffer=null;
        }


        return ans.toString();
    }
}
public class Main {
}
