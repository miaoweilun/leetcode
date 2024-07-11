package _36;

/*
* mwl 36. 有效的数独
* */

class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][][] flag = new boolean[3][9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    int index = board[i][j]-'0'-1;
                    // System.out.println(i+" : "+j);
                    if(flag[0][i][index]){
                        // System.out.println("     1    ");
                        return false;
                    }
                    flag[0][i][index]=true;

                    if(flag[1][j][index]){
                        // System.out.println("     2    ");
                        return false;
                    }
                    flag[1][j][index]=true;

                    if(flag[2][i/3*3+j/3][index]){
                        // System.out.println("     3    ");
                        return false;
                    }
                    flag[2][i/3*3+j/3][index]=true;
                }
            }
        }

        return true;
    }
}

public class Main {
}
