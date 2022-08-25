class Solution {
    int[][] dirs = new int[][]{{0,1},{0,-1},{-1,0},{1,0}} ;
    public boolean exist(char[][] board, String word) {
         for (int row = 0; row < board.length; ++row)
            for (int col = 0; col < board[0].length; ++col)
                if (dfs(board,word,row,col,0))
                      return true;
         return false;
    }
    boolean dfs(char[][] board,String word, int i , int j, int cnt){
        boolean res = false;
        int m = board.length, n = board[0].length;
        if(cnt>= word.length()) return true;
        if(i<0||j<0||i>=m||j>=n||board[i][j]!=word.charAt(cnt)) return false;
        
        board[i][j] = '#';
        for(int[] dir: dirs){
            res = dfs(board,word,i+dir[0],j+dir[1],cnt+1);
            if(res) break;
        }
        board[i][j] = word.charAt(cnt);
        return res;
    }
}
