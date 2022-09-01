class Solution {
    int result =0;
    public int countPairs(TreeNode root, int distance) {
        dfs(root,distance);
        return result;
    }
    
    int[] dfs(TreeNode root, int dist){
        if(root == null) return new int[dist+1];
        if(root.left == null && root.right == null){
            int[] res  = new int[dist+1];
            res[1]++;
            return res;
        }
        int[] l = dfs(root.left,dist);
        int[] r = dfs(root.right, dist);
        for(int i = 1;i<l.length;i++){
            for(int j = dist-1;j>=0;j--){
                if(i+j<=dist){
                    result+=l[i]*r[j];
                }
            }
        }
        
         int res[] = new int[dist+1];
        //shift by 1
        for(int i=res.length-2;i>=1;i--){
            res[i+1] = l[i]+r[i];
        }
        
        return res;
    }
}
