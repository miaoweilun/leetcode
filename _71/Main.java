package _71;
/*
* mwl
* */

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] pathes = path.split("/");



        Stack<String> stack = new Stack<>();

        StringBuilder bf = new StringBuilder();


        for(String s : pathes){
            if(s.equals(""))
                continue;

            if(s.equals("..") && !stack.isEmpty())
                stack.pop();
            else if(!s.equals(".") && !s.equals(".."))
                stack.push(s);
        }

        if(stack.isEmpty()){
            bf.append("/");
        }
        while(!stack.isEmpty()){
            bf.insert(0, "/" + stack.pop());
        }
        return bf.toString();
    }
}
public class Main {
}
