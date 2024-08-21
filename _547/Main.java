package _547;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int length = isConnected.length, ans=0;
        boolean[] visited = new boolean[length];
        for(int i=0; i<length; i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(visited, i, length, isConnected);
                ans++;
            }
        }
        return ans;
    }

    public void dfs(boolean[] visited, int begin, int length, int[][] isConnected){
        for(int i=0; i<length; i++){
            if(!visited[i] && isConnected[begin][i]!=0){
                visited[i]=true;
                dfs(visited, i, length, isConnected);
            }
        }
    }
}

public class Main {
}
