class Solution {
    int[] f;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        f=new int[n];
        int res = 0;
        for(int i = 0;i<n;i++) f[i]=i;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(isConnected[i][j] == 1) {
                    if(find(i)!= find(j)){
                        f[find(i)] = find(j);
                    }
                 
                }
            }
        }
         for (int i = 0; i < n; i++) {
            if (f[i] == i)
                res++;
        }
        return res;
    }
  
    int find(int x) {
    if (f[x] == x) return x;
    return f[x] = find(f[x]);
    }
}
