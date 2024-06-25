package _20;


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch==')'){
                if(stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
            else if(ch==']'){
                if(stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
            else if(ch=='}'){
                if(stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
            else{
                stack.push(ch);
            }
        }

        if(!stack.isEmpty())
            return false;
        return true;
    }
}
public class Main {
}
