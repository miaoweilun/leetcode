package _316;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] exist = new boolean[26];
        int[] lastIndex = new int[26];
        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();

        for(int i=0; i<chs.length; i++){
            lastIndex[chs[i]-'a'] = i+1;
        }

        stack.add(chs[0]);
        exist[chs[0]-'a']=true;

        for(int i=1; i<chs.length; i++){
            char ch = stack.peek();
            while(chs[i]-stack.peek()<0 && lastIndex[stack.peek()-'a']>i && !exist[chs[i]-'a']){
                exist[ch-'a']=false;
                stack.pop();
                if(stack.isEmpty())
                    break;
                ch=stack.peek();
            }
            if(!exist[chs[i]-'a']){

                stack.add(chs[i]);
                exist[chs[i]-'a']=true;
            }
        }

        StringBuilder ss = new StringBuilder();
        while(!stack.isEmpty()){
            ss.insert(0, stack.pop());
        }

        return ss.toString();
    }
}

public class Main {
    public static void main(String[] args) {
//        String s = "cbacdcbc";
        String s = "abacb";
        System.out.println(new Solution().removeDuplicateLetters(s));
    }
}
