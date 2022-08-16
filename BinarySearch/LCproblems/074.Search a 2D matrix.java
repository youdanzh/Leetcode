class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length,n = matrix[0].length;
        int l = 0, r = m*n -1; //一维化坐标: row*n+col
        while(l<=r){
            int mid = l+(r-l)/2;
            if(pos(matrix,mid) == target){
                return true;
            }
            if(pos(matrix,mid)<target)l = mid+1;
            else r = mid-1;
        }
        return false;
            
    }
    int pos(int[][] matrix, int idx){
        int m = matrix.length,n = matrix[0].length;
        int x = idx/n, y = idx%n;
        return matrix[x][y]; 
    }
}
