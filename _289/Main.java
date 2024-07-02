package _289;
/*
* mwl 289. 生命游戏
* */

class Solution {
    public void gameOfLife(int[][] board) {

        int line=board.length, col=board[0].length;
        int[][] count = new int[line][col];

        for(int i=0; i<line; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]==1){
                    if(i-1>=0){
                        if(j-1>=0)
                            count[i-1][j-1]++;
                        count[i-1][j]++;
                        if(j+1<col)
                            count[i-1][j+1]++;
                    }
                    if(j-1>=0)
                        count[i][j-1]++;
                    if(j+1<col)
                        count[i][j+1]++;
                    if(i+1<line){
                        if(j-1>=0)
                            count[i+1][j-1]++;
                        count[i+1][j]++;
                        if(j+1<col)
                            count[i+1][j+1]++;
                    }
                }
            }
        }

        for(int i=0; i<line; i++){
            for(int j=0; j<col; j++){
                if(count[i][j]<2||count[i][j]>3)
                    board[i][j]=0;
                else if(count[i][j]==3)
                    board[i][j]=1;
            }
        }

    }
}

public class Main {
}
