package _1071;
/*
* mwl 1071. 字符串的最大公因子
* */

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1=str1.length(), l2=str2.length();
        int l=Math.min(l1, l2);

        while(l>0){
            if(l1%l==0 && l2%l==0){
                String s=str1.substring(0, l);
                int i=0;
                for(; i<l1/l; i++){
                    if(!str1.substring(i*l,i*l+l).equals(s))
                        break;
                }
                if(i==l1/l){
                    i=0;
                    for(; i<l2/l; i++){
                        if(!str2.substring(i*l,i*l+l).equals(s))
                            break;
                    }
                    if(i==l2/l)
                        return s;
                }
            }
            l--;
        }

        return "";
    }
}

public class Main {
}
