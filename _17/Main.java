package _17;


/*
* mwl
* */


import java.util.*;



class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        Queue<StringBuilder> queue = new LinkedList<>();
        Map<Character, List<Character>> map = new HashMap<>();

        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        for(int i=2; i<7; i++){
            map.put((char)('2'+i-2), Arrays.asList((char)('a'+(i-2)*3), (char)('a'+(i-2)*3+1), (char)('a'+(i-2)*3+2)));
        }

        // for(Map.Entry entry : map.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        for(int i=0; i<digits.length(); i++){
            List<Character> list = map.get(digits.charAt(i));
            int size = queue.size();
            if(size==0){
                for(Character ch : list){
                    StringBuilder builder = new StringBuilder();
                    builder.append(ch);
                    queue.offer(builder);
                }

            }else{
                for(int j=0; j<size; j++){
                    StringBuilder oldBuilder = queue.poll();
                    for(char ch : list){
                        StringBuilder builder = new StringBuilder(oldBuilder);
                        builder.append(ch);
                        queue.offer(builder);
                    }
                }
            }
        }

        while(!queue.isEmpty()){
            ans.add(queue.poll().toString());
        }
        return ans;
    }
}
public class Main {
}
