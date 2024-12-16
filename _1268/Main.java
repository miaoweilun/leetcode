package _1268;

import java.util.*;

class Solution {

    // mwl 1. 定义字典树数据结构
    static class Trie{
        Trie[] nodes;
        List<String> list;

        public Trie(){
            nodes = new Trie[26];
            list = new ArrayList<>();
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();

        // 1. 先进性排序（要求按照字段序）
        Arrays.sort(products);

        // 2. 构建字典树
        Trie trie = new Trie();
        for(String p : products){
            Trie node = trie;
            for(char ch : p.toCharArray()){
                int index = ch - 'a';
                if(node.nodes[index] == null){
                    node.nodes[index] = new Trie();
                }
                if(node.nodes[index].list.size()<3)
                    node.nodes[index].list.add(p);
                node = node.nodes[index];
            }
        }



        Trie node = trie;
        for(char ch : searchWord.toCharArray()){
            int index = ch - 'a';
            if(node!=null && node.nodes[index]!=null){
                ans.add(node.nodes[index].list);
                node=node.nodes[index];
            }else{
                node=null;
                ans.add(new ArrayList<>());
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] ss = {
                "mobile","mouse","moneypot","monitor","mousepad"
        };
        List<List<String>> mouse = new Solution().suggestedProducts(ss, "mouse");

        for (List<String> list : mouse) {
            for (String s : list) {
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }
}
