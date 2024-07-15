package _67;
/*
* mwl 67. 二进制求和
* */

class Solution {
    public String addBinary(String a, String b) {
        int up=0, aLength=a.length(), bLength=b.length();
        int indexA=aLength-1, indexB=bLength-1;
        StringBuilder builder = new StringBuilder();
        while(indexA>=0 && indexB>=0){
            int aNum = a.charAt(indexA)-'0';
            int bNum = b.charAt(indexB)-'0';
            indexA--;
            indexB--;
            int s = up+aNum+bNum;
            char ch=' ';
            switch(s){
                case 0:
                    up=0;
                    ch='0';
                    break;
                case 1:
                    up=0;
                    ch='1';
                    break;
                case 2:
                    up=1;
                    ch='0';
                    break;
                case 3:
                    up=1;
                    ch='1';
                    break;
            }
            builder.insert(0, ch);
        }

        while(indexA>=0){
            int aNum = a.charAt(indexA)-'0';
            int s = up+aNum;
            char ch=' ';
            switch(s){
                case 0:
                    up=0;
                    ch='0';
                    break;
                case 1:
                    up=0;
                    ch='1';
                    break;
                case 2:
                    up=1;
                    ch='0';
                    break;
            }
            indexA--;
            builder.insert(0, ch);
        }

        while(indexB>=0){
            int bNum = b.charAt(indexB)-'0';
            int s = up+bNum;
            char ch=' ';
            switch(s){
                case 0:
                    up=0;
                    ch='0';
                    break;
                case 1:
                    up=0;
                    ch='1';
                    break;
                case 2:
                    up=1;
                    ch='0';
                    break;
            }
            indexB--;
            builder.insert(0, ch);
        }
        if(up!=0)
            builder.insert(0, '1');

        return builder.toString();
    }
}

public class Main {
}
