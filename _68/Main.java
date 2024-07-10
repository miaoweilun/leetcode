package _68;
/*
* mwl 68. 文本左右对齐
* */

import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        int bufferLength=0;
        for(int i=0; i<words.length;){


            if(bufferLength==0){
                queue.offer(words[i]);
                bufferLength = words[i].length();
                i++;
            }else if(bufferLength+words[i].length()+1 <= maxWidth){
                queue.offer(words[i]);
                bufferLength = bufferLength + words[i].length() + 1;
                i++;
            }else{

                StringBuilder buffer = new StringBuilder();
                if(queue.size() == 1){
                    buffer.append(queue.poll());
                    for(int k=buffer.length(); k<maxWidth; k++)
                        buffer.append(" ");
                    ans.add(buffer.toString());
                }else{
                    // 还剩多少空格
                    int leftKg = maxWidth-bufferLength;
                    // 每个单词间隔多少个空格
                    int numKg = leftKg/(queue.size()-1) + 1;
                    // 不够均衡分配剩下的空格
                    int count = leftKg%(queue.size()-1);

                    StringBuilder builderKg = new StringBuilder();
                    for(int j=0; j<numKg; j++)
                        builderKg.append(" ");

                    while(!queue.isEmpty()){
                        buffer.append(queue.poll());
                        if(!queue.isEmpty())
                            buffer.append(builderKg);
                        if(count!=0){
                            buffer.append(" ");
                            count--;
                        }
                    }
                    ans.add(buffer.toString());


                }
                // System.out.println("答案:" + buffer.toString());

                bufferLength=0;
            }
        }

        StringBuilder last = new StringBuilder();
        while(!queue.isEmpty()){
            last.append(queue.poll());
            if(!queue.isEmpty())
                last.append(" ");
        }
        last.append(" ".repeat(Math.max(0, maxWidth - last.length())));

        ans.add(last.toString());

        return ans;
    }
}

public class Main {

}
