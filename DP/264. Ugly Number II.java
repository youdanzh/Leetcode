class Solution {
    public int nthUglyNumber(int n) {
        int a=1,b=1,c=1;
        int p2 =1, p3=1 ,p5 =1;
        int[] dp = new int[n+1];
        int p=1;
        while(p<=n){
            int min= Math.min(Math.min(a,b),c);
            dp[p] =min;
            p++;
            if(min == a) {
                a=2*dp[p2];
                p2++;
            }
            if(min == b) {
                b=3*dp[p3];
                p3++;
            }
            if(min == c) {
                c=5*dp[p5];
            }
        }
     return dp[n];
    }
    
}
