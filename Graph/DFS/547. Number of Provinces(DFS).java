class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int res = 0;
       int[] visited = new int[n];
        for(int i = 0 ; i<n;i++){
                 if(visited[i] ==0) {
                     dfs(isConnected,visited,i);
                     res++;
                 }
        }
        return res;
    }
    void dfs(int[][] mat,int[] visited,int i ){
        for(int j = 0 ; j<mat.length;j++){
            if(mat[i][j] == 1 &&visited[j]==0){
                visited[j] = 1;
                dfs(mat,visited,j);
            }
        }
    }
}
