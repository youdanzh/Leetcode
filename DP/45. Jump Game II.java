class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0 , len = 0;
        int res = 0;
        for( int i = 0 ; i<n-1;i++){
            len = Math.max(len, i+nums[i]);
            if(end == i){
                res++;
                end = len;
            }
        }
        return res;
    }
}
