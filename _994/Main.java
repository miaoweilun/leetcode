package _994;

import java.util.*;

class Solution {


    public int orangesRotting(int[][] grid) {
        int row = grid.length, col = grid[0].length, ans=0, left=0;
        boolean[][] visited = new boolean[row][col];

        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i, j});
                    visited[i][j]=true;
                }else if(grid[i][j] == 1){
                    left++;
                }
            }
        }

        while(!queue.isEmpty() && left>0){
            ans++;
            int size = queue.size();
            for(int k=0; k<size; k++){
                int[] indexes = queue.poll();
                int i=indexes[0], j=indexes[1];
                if(i>0 && grid[i-1][j]==1 && !visited[i-1][j]){
                    visited[i-1][j]=true;
                    grid[i-1][j]=2;
                    queue.add(new int[]{i-1, j});
                    left--;
                }
                if(i<row-1 && grid[i+1][j]==1 && !visited[i+1][j]){
                    visited[i+1][j]=true;
                    grid[i+1][j]=2;
                    queue.add(new int[]{i+1, j});
                    left--;
                }
                if(j>0 && grid[i][j-1]==1 && !visited[i][j-1]){
                    visited[i][j-1]=true;
                    grid[i][j-1]=2;
                    queue.add(new int[]{i, j-1});
                    left--;
                }
                if(j<col-1 && grid[i][j+1]==1 && !visited[i][j+1]){
                    visited[i][j+1]=true;
                    grid[i][j+1]=2;
                    queue.add(new int[]{i, j+1});
                    left--;
                }
            }

        }

        return left<=0? ans:-1;
    }
}

public class Main {
}
