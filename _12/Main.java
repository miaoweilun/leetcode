package _12;
/*
* mwl 12. 整数转罗马数字
* */


class Solution {
    public String intToRoman(int num) {
        StringBuilder ss = new StringBuilder();
        int times=1;
        while(num!=0){
            int n=num%10;
            num/=10;

            if(n==0){

            }
            else if(n==4){
                switch(times){
                    case 1:
                        ss.insert(0, "IV");
                        break;
                    case 10:
                        ss.insert(0, "XL");
                        break;
                    case 100:
                        ss.insert(0, "CD");
                        break;
                }
            }
            else if(n==9){
                switch(times){
                    case 1:
                        ss.insert(0, "IX");
                        break;
                    case 10:
                        ss.insert(0, "XC");
                        break;
                    case 100:
                        ss.insert(0, "CM");
                        break;
                }
            }
            else if(n<4){
                switch(times){
                    case 1:
                        for(int i=0; i<n; i++){
                            ss.insert(0, "I");
                        }
                        break;
                    case 10:
                        for(int i=0; i<n; i++){
                            ss.insert(0, "X");
                        }
                        break;
                    case 100:
                        for(int i=0; i<n; i++){
                            ss.insert(0, "C");
                        }
                        break;
                    case 1000:
                        for(int i=0; i<n; i++){
                            ss.insert(0, "M");
                        }
                        break;
                }
            }
            else{
                switch(times){
                    case 1:
                        for(int i=0; i<n-5; i++){
                            ss.insert(0, "I");
                        }
                        ss.insert(0, "V");
                        break;
                    case 10:
                        for(int i=0; i<n-5; i++){
                            ss.insert(0, "X");
                        }
                        ss.insert(0, "L");
                        break;
                    case 100:
                        for(int i=0; i<n-5; i++){
                            ss.insert(0, "C");
                        }
                        ss.insert(0, "D");
                        break;
                }
            }

            times *= 10;
        }
        return ss.toString();
    }
}

public class Main {
}
