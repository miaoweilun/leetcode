package _64;
/*
* mwl 64. 最小路径和
* */

class Solution {
    public int minPathSum(int[][] grid) {
        int l=grid.length, c=grid[0].length;
        int[][] minAll = new int[l][c];

        minAll[0][0] = grid[0][0];
        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                if(i==0 && j==0)
                    continue;
                int left = j==0 ? Integer.MAX_VALUE : minAll[i][j-1];
                int up = i==0 ? Integer.MAX_VALUE :minAll[i-1][j];
                minAll[i][j] = Math.min(left, up)+grid[i][j];
            }
        }

        return minAll[l-1][c-1];
    }
}

public class Main {
}
