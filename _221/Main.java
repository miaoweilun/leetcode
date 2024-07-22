package _221;
class Solution {
    public int maximalSquare(char[][] matrix) {
        int l=matrix.length, c=matrix[0].length;
        int[][] max = new int[l][c];
        max[0][0]=matrix[0][0]-'0';
        int ans= max[0][0];
        for(int i=1; i<c; i++){
            max[0][i]=matrix[0][i]-'0';
            if(max[0][i]==1)
                ans=1;
        }
        for(int i=1; i<l; i++){
            max[i][0]=matrix[i][0]-'0';
            if(max[i][0]==1)
                ans=1;
        }

        for(int i=1; i<l; i++){
            int bound=-1;
            for(int j=1; j<c; j++){
                int num=matrix[i][j]-'0';
                if(num==1){
                    int min=max[i-1][j];
                    if(max[i-1][j-1]<min)
                        min=max[i-1][j-1];
                    if(max[i][j-1]<min)
                        min=max[i][j-1];
                    max[i][j]=min+1;
                    if(ans<max[i][j])
                        ans=max[i][j];
                }else{
                    max[i][j]=0;
                }
            }
        }

        return ans*ans;
    }
}
public class Main {
}
