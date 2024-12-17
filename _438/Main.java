package _438;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (Integer anagram : new Solution().findAnagrams("cbaebabacd", "abc")) {
            System.out.print(anagram + ", ");
        }
    }
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int len1=s.length(), len2=p.length();
        char[] sCh = s.toCharArray(), pCh = p.toCharArray();
        int[] map1 = new int[26], map2;
        List<Integer> ans = new ArrayList<>();

        for(char ch : pCh){
            map1[ch-'a']++;
        }

        map2 = Arrays.copyOf(map1, 26);

        for (int i=0; i<=len1-len2; ) {
            int j=i;
            for (; j<i+len2; j++) {
                if(map2[sCh[j]-'a']==0)
                    break;
                map2[sCh[j]-'a']--;
            }
            if(j==i+len2){
                map2 = Arrays.copyOf(map1, 26);
                ans.add(i);
                i++;
            }else{
                if(map1[sCh[j]-'a']==0)
                    i=j+1;
                else
                    i++;
                map2 = Arrays.copyOf(map1, 26);
            }
        }

        return ans;
    }
}
