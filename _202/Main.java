package _202;
/*
* mwl 快乐数
* */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n != 1){
            int count = 0;
            while(n!=0){
                count+=Math.pow((n%10), 2);
                n/=10;
            }
            if(set.contains(count))
                return false;
            set.add(count);
            n = count;
        }

        return true;
    }
}

public class Main {

}
