package _63;

/*
* mwl 63. 不同路径 II
* */

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1)
            return 0;
        int l=obstacleGrid.length, c=obstacleGrid[0].length;
        int[][] nums = new int[l][c];
        nums[0][0]=1;

        for(int j=1; j<c; j++){
            if(obstacleGrid[0][j]!=0){
                break;
            }
            nums[0][j]=1;
        }

        for(int i=1; i<l; i++){
            if(obstacleGrid[i][0]!=0){
                break;
            }
            nums[i][0]=1;
        }

        for(int i=1; i<l; i++){
            for(int j=1; j<c; j++){
                if(obstacleGrid[i][j]==0){
                    nums[i][j]=nums[i-1][j]+nums[i][j-1];
                }
            }
        }

        return nums[l-1][c-1];
    }
}

public class Main {
}
