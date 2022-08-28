class Solution {
    public int numDecodings(String s) {
        int n  = s.length();
        if (n < 1) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2 ; i <=n;i++){
            char c = s.charAt(i-1);
            char d = s.charAt(i-2);
             if ('1' <= c && c <= '9') {
                
                dp[i] += dp[i - 1];
            }
            if(d =='1' || d == '2'&&c<= '6'){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
