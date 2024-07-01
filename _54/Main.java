package _54;


import java.util.*;

class Solution {

    private int x;
    private int y;
    private List<Integer> ans;

    public Solution(){
        x=0;
        y=0;
        ans=new ArrayList<>();
    }

    public boolean tryMove(int fx, boolean[][] position, int[][] matrix){
        switch(fx){
            case 0:
                if(x+1>=position[0].length || position[y][x + 1])
                    return false;
                x++;
                break;
            case 1:
                if(y+1>=position.length || position[y+1][x])
                    return false;
                y++;
                break;
            case 2:
                if(x-1<0 || position[y][x - 1])
                    return false;
                x--;
                break;
            case 3:
                if(y-1<0 || position[y - 1][x])
                    return false;
                y--;
                break;
        }
        System.out.println(x + "   :   " + y);
        position[y][x]=true;
        ans.add(matrix[y][x]);
        return true;
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix.length<1 || matrix[0].length<1)
            return ans;

        boolean[][] position = new boolean[matrix.length][matrix[0].length];
        int fx=0;

        ans.add(matrix[0][0]);
        position[0][0]=true;


        while(true){
            int failureTimes = 0;
            while(!tryMove(fx, position, matrix) && failureTimes<4){
                fx = (fx+1)%4;
                failureTimes++;
            }
            if(failureTimes >= 4)
                break;
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Integer> ans = new Solution().spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        });

        ans.forEach(System.out::println);
    }
}
