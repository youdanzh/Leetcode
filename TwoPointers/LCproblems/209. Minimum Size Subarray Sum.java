class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0,r = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            r++;
            while(l<r&&sum>=target){
                res = Math.min(r-l,res);
                sum -= nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
