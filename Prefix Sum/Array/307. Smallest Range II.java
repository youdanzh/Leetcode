class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int ans  = nums[nums.length-1]- nums[0];
       for(int i = 0;i< nums.length-1;i++){
        int a = nums[i], b = nums[i+1];
           int high = Math.max(nums[nums.length-1]-k,a+k);
           int low = Math.min(nums[0]+k,b-k);
           ans = Math.min(ans,high-low);
       }
        return ans;
    }
}
