package _1456;
/*
* mwl 1456. 定长子串中元音的最大数目
* */

class Solution {

    private boolean isYuan(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int max=0;
        for(int i=0; i<k; i++){
            if(isYuan(s.charAt(i))){
                max++;
            }
        }
        // System.out.println(max);
        if(max==k)
            return k;

        int sum=max, left=0;
        for(int i=k; i<s.length(); i++){
            if(isYuan(s.charAt(left)))
                sum--;
            if(isYuan(s.charAt(i)))
                sum++;
            if(sum>max){
                if(sum==k)
                    return k;
                max = sum;
            }
            left++;
        }

        return max;
    }
}

public class Main {
}
