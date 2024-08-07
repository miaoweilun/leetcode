package _394;

// mwl 394. 字符串解码

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stackNum = new Stack<>();
        Stack<StringBuilder> stackS = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                if(i==0 || !Character.isDigit(s.charAt(i-1)))
                    stackNum.push(ch-'0');
                else{
                    stackNum.push(stackNum.pop()*10+(ch-'0'));
                }

                // System.out.println(ch-'0');
            }else if(ch=='['){
                StringBuilder builder = new StringBuilder();
                stackS.push(builder);
            }else if(ch==']'){
                int times = stackNum.pop();
                StringBuilder builder = stackS.pop();
                if(stackS.isEmpty()){
                    for(int j=0; j<times; j++){
                        ans.append(builder);
                    }
                }else{
                    for(int j=0; j<times; j++){
                        stackS.peek().append(builder);
                    }
                }
            }else{
                if(stackNum.isEmpty()){
                    ans.append(ch);
                }else{
                    stackS.peek().append(ch);
                }
            }
            // System.out.println(ans.toString());
        }
        return ans.toString();
    }
}
public class Main {
}
