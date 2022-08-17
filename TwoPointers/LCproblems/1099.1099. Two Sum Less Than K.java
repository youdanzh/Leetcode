class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = -1;
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < k) {
               if((k -(nums[left] + nums[right]))<min) {
                   sum = nums[left] + nums[right];
                   min = k - (nums[left] + nums[right]);
               }
                left++;
            } else {
                right--;
            }
        }
        return sum;
    }
}
    
