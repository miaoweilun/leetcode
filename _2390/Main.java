package _2390;
// 2390. 从字符串中移除星号

import java.util.Stack;

class Solution {

    public String removeStars1(String s) {
        StringBuilder st = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                st.deleteCharAt(st.length() - 1);
            } else {
                st.append(c);
            }
        }
        return st.toString();
    }


    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch!='*'){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()){
            builder.insert(0, stack.pop());
        }

        return builder.toString();
    }
}

public class Main {
}
