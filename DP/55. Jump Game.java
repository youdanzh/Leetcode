class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int res = 0 ; 
        for(int i = 0 ; i<n-1;i++){
            res = Math.max(res, i+nums[i]);
            if(res <= i ) return false; 
        }
        return res>=n-1;
    }
}
