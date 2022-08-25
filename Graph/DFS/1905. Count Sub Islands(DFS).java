class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m  = grid1.length, n = grid1[0].length;
        for(int i = 0 ; i< m;i++){
            for(int j = 0; j<n;j++){
             if (grid1[i][j] == 0 && grid2[i][j] == 1) dfs(grid2,i,j);
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    res++;
                    dfs(grid2, i, j);
                }
            }
        }
        return res;
        
    }
    void dfs(int[][] grid, int i , int j ){
        int m = grid.length,n = grid[0].length;
        if(i<0||j<0||i>=m||j>=n) return;
        if(grid[i][j] == 0 ) return;
        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        
    }
}
