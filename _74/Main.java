package _74;

// mwl 74. 搜索二维矩阵

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 先确定可能在哪一行
        int begin=0, end=matrix.length-1, length = matrix[0].length;

        while(begin<end){
            int mid = (begin+end)/2;
            if(matrix[mid][0]==target||matrix[mid][length-1]==target)
                return true;
            if(matrix[mid][0]>target)
                end=mid-1;
            else if(matrix[mid][length-1]<target)
                begin=mid+1;
            else{
                begin=mid;
                break;
            }
        }

        //确定在哪一列
        // System.out.println(begin);
        int line=begin;
        begin=0;
        end=length-1;
        while(begin<end){
            int mid = (begin+end)/2;
            if(matrix[line][mid]==target)
                return true;
            if(matrix[line][mid]>target)
                end=mid-1;
            else begin=mid+1;
        }
        if(matrix[line][begin]==target)
            return true;
        return false;
    }
}

public class Main {
}
