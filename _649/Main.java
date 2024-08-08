package _649;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String predictPartyVictory(String senate) {
        Set<Integer> set = new HashSet<>();
        boolean hasR=false, hasD=false;
        int length=senate.length(), delete=0;

        do{
            hasD=false;
            hasR=false;
            for(int i=0; i<length; i++){
                if(!set.contains(i)){
                    char ch = senate.charAt(i);
                    if(ch=='R'){
                        if(delete>=0){
                            hasR=true;
                        }else{
                            set.add(i);
                        }
                        delete++;
                    }else{
                        if(delete<=0){
                            hasD=true;
                        }else{
                            set.add(i);
                        }
                        delete--;
                    }
                }
            }

        }while(hasR && hasD);

        return hasR ? "Radiant" : "Dire";
    }
}

public class Main {
}
