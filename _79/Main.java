package _79;
/*
* mwl 79. 单词搜索
* */

class Solution {

    public boolean search(char[][] board, boolean[][] flag, int line, int col, int index, String word){
        if(index>=word.length())
            return true;
        if(line<0 || line>=board.length || col<0 || col>=board[0].length || board[line][col]!=word.charAt(index) || flag[line][col])
            return false;
        flag[line][col]=true;
        index++;
        if(search(board, flag, line-1, col, index, word))
            return true;
        if(search(board, flag, line+1, col, index, word))
            return true;
        if(search(board, flag, line, col-1, index, word))
            return true;
        if(search(board, flag, line, col+1, index, word))
            return true;
        flag[line][col]=false;
        index--;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] flag = new boolean[board.length][board[0].length];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(search(board, flag, i, j, 0, word))
                    return true;
            }
        }

        return false;
    }
}

public class Main {
}
