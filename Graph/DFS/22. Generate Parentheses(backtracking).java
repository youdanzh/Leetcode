class Solution {
    
    List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        if(n == 0 ) return res;
        dfs(n,n,new StringBuilder());
        return res;
    }
    void dfs(int l, int r,StringBuilder sb ){
        if(r<l) return;
        if(r<0||l<0) return;
        if(l == 0 &&r == 0 ) {
            res.add(sb.toString());
            return;
        }
        sb.append('(');
        dfs(l-1,r,sb);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append(')');
        dfs(l,r-1,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
