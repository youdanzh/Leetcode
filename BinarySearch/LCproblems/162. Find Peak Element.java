class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0 , r = nums.length-1;
        while(l<r){
            int m = l+(r-l)/2;
            if(nums[m]>nums[m+1]) r = m;//寻找峰值落到的位置
            else l = m+1;
        }
        return l;
    }
}
