int m = matrix.length,n = matrix[0].length;
        int[][] prefixSum = new int[m+1][n+1];
          for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                prefixSum[r + 1][c + 1] = prefixSum[r][c + 1] + prefixSum[r + 1][c] - prefixSum[r][c] + matrix[r][c];
            }
        }
