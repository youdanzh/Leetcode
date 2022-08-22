class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0 , r =0;
        int product =1;
        int cnt = 0;
        while(r<nums.length){
            product = product*nums[r];
            r++;
            while(l<r&&product>=k){
                product /= nums[l];
                l++;
            }
            cnt += r-l;
        }
        return cnt;
    }
}
