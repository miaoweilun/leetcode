package _2300;

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length, m=potions.length;
        int[] ans = new int[n];

        Arrays.sort(potions);
        for(int i=0; i<n; i++){
            int l=0, r=m-1, mid=-1;
            long now= spells[i];
            while(l<=r){
                mid=(l+r)/2;
                long buffer=(long)potions[mid] * now;
                if(buffer>=success){
                    r=mid-1;
                    if(mid==l || (long)potions[mid-1] * now < success){
                        mid--;
                        break;
                    }
                }else{
                    l=mid+1;
                    if(mid==r || (long)potions[mid+1] * now >= success)
                        break;
                }
            }
            ans[i]=m-mid-1;
        }

        return ans;
    }
}

public class Main {
}
