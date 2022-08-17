class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
          if (nums.length == 1) {
            return nums[0];
        }
          if (nums[r] > nums[0]) {
            return nums[0];
        }
        while(l<=r){     
            int m = l+(r-l)/2;
            if(nums[m]<nums[r]) r = m;
            else if(nums[m]>nums[r]) l = m+1;
            else r--;
        }
        return nums[l];
    }
}
