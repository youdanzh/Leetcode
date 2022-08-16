class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m] == target) return m;
            if(nums[m]>=nums[l]){
                if(target<nums[m]&&target>=nums[l]){
                    r=m-1;
                }
                else{
                    l = m+1;
                }
            }
            else{
                if(target>nums[m]&&target<=nums[r]){
                    l = m+1;
                }
                else r = m-1;
                
            }
            
        }
        return -1;
    }
}
