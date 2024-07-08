package _274;

/*
* mwl 274. H 指数
* */

class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[citations.length];

        for(int num : citations){
            int i=1;
            while(num>=i && i<=citations.length){
                count[i-1]++;
                i++;
            }
        }

        for(int i=citations.length-1; i>=0; i--){
            if(count[i]>=i+1)
                return i+1;
        }

        return 0;
    }
}
public class Main {
}
