package _50;

/*
* mwl 50. Pow(x, n)
* */

class Solution {

    public double get(double x, int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        double s = get(x, n/2);


        return n%2==0 ? s*s : s*s*x;
    }

    public double myPow(double x, int n) {
        boolean flag = n<0 ? true : false;
        n = Math.abs(n);

        double ans = get(x, n);

        return flag ? 1/ans : ans;
    }
}

public class Main {
}
