package _1926;

import java.util.*;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        int h=maze.length, w=maze[0].length, ans=0;
        boolean[][] visited = new boolean[h][w];
        visited[entrance[0]][entrance[1]]=true;
        boolean flag=false;

        queue.add(entrance);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] index = queue.poll();
                int y=index[0], x=index[1];
                // System.out.println(y + " : " + x);
                if((x==0 || x==w-1 || y==0 || y==h-1) && (y!=entrance[0] || x!=entrance[1])){
                    flag=true;
                    break;
                }

                if(y+1<h && maze[y+1][x] == '.' && !visited[y+1][x]){
                    queue.add(new int[]{y+1, x});
                    visited[y+1][x]=true;
                }
                if(y>0 && maze[y-1][x] == '.' && !visited[y-1][x]){
                    queue.add(new int[]{y-1, x});
                    visited[y-1][x]=true;
                }
                if(x+1<w && maze[y][x+1] == '.' && !visited[y][x+1]){
                    queue.add(new int[]{y, x+1});
                    visited[y][x+1]=true;
                }
                if(x>0 && maze[y][x-1] == '.' && !visited[y][x-1]){
                    queue.add(new int[]{y, x-1});
                    visited[y][x-1]=true;
                }
            }

            if(flag)
                break;

            ans++;
        }
        if(flag)
            return ans;
        else
            return -1;
    }
}

public class Main {
}
