package _841;

import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int count = 1, size = rooms.size();
        boolean[] visited = new boolean[size];
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        for(int index : rooms.get(0)){
            if(!visited[index]){
                queue.add(index);
                visited[index]=true;
                count++;
            }
        }

        while(!queue.isEmpty()){
            int length = queue.size();
            for(int i=0; i<length; i++){
                for(int index : rooms.get(queue.poll())){
                    if(!visited[index]){
                        queue.add(index);
                        visited[index]=true;
                        count++;
                    }
                }
            }
            if(count==size)
                return true;
        }

        return count==size;
    }
}

public class Main {
}
