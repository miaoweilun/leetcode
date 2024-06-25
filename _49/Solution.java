package _49;

import java.util.*;

/*字母异位词分组*/

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        // 1. 定义结果列表
        List<List<String>> result = new ArrayList<List<String>>();


        // 2. 遍历strs
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String index = Arrays.toString(chars);
            if(map.containsKey(index)){
                map.get(index).add(s);
            }else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(index,list);
            }

        }


        return new ArrayList(map.values());
    }


    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = new Solution().groupAnagrams(s);
        for (List<String> ss: lists) {
            System.out.println(" ========================= ");
            for (String s1: ss) {
                System.out.println(s1);
            }
        }
    }
}
