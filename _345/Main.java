package _345;
class Solution {

    private boolean isY(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int i=0, j=ans.length-1;
        while(i<j){
            while(i<j && !isY(ans[i])){
                i++;
            }
            while(i<j && !isY(ans[j])){
                j--;
            }
            if(i<j){
                // System.out.println(i+" - "+j);
                char ch = ans[i];
                ans[i]=ans[j];
                ans[j]=ch;
                i++;
                j--;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(char ch : ans)
            builder.append(ch);
        return builder.toString();
    }
}
public class Main {
}
