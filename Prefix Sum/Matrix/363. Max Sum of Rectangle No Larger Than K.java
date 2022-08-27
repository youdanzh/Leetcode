class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length,n = matrix[0].length;
        int[][] prefixSum = new int[m+1][n+1];
          for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                prefixSum[r + 1][c + 1] = prefixSum[r][c + 1] + prefixSum[r + 1][c] - prefixSum[r][c] + matrix[r][c];
            }
        }
         int max = Integer.MIN_VALUE;

        for (int rowSize = 0; rowSize < m; rowSize++) {
            for (int colSize = 0; colSize <n; colSize++) {
                for (int rStart = 0; rStart + rowSize < m; rStart++) {
                    for (int cStart = 0; cStart + colSize <n; cStart++) {
                        int r1 = rStart;
                        int c1 = cStart;
                        int r2 = rStart + rowSize;
                        int c2 = cStart + colSize;
                        int sum = prefixSum[r2 + 1][c2 + 1] + prefixSum[r1][c1] - prefixSum[r1][c2 + 1] - prefixSum[r2 + 1][c1];

                        if (sum == k) return k;
                        else if (sum < k) max = Math.max(max, sum);
                    }
                }
            }
        }

        return max;
    }
}   
    
