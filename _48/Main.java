package _48;

/*
* mwl 48. 旋转图像
* */

class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;
        for(int i=0; i<row/2; i++){
            for(int j=i; j<col-i-1; j++){
                int buffer = matrix[i][j];
                matrix[i][j] = matrix[row-j-1][i];
                matrix[row-j-1][i] = matrix[row-i-1][col-j-1];
                matrix[row-i-1][col-j-1] = matrix[j][col-i-1];
                matrix[j][col-i-1] = buffer;
            }
        }
    }
}

public class Main {
}
