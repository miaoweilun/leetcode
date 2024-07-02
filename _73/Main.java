package _73;
/*
* mwl 73. 矩阵置零
* */

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] line = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    col[j]=true;
                    line[i]=true;
                }
            }
        }

        for(int i=0; i<line.length; i++){
            if(line[i]){
                for(int j=0; j<matrix[0].length; j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=0; j<col.length; j++){
            if(col[j]){
                for(int i=0; i<matrix.length; i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

public class Main {


}
