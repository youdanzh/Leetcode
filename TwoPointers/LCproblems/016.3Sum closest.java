class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min= Integer.MAX_VALUE,res = 0;
     
         for(int i = 0 ; i <nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l = i+1,r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum>target) {
                    r--;
                    if(Math.abs(sum-target)<min) {
                        res = sum;
                        min = Math.abs(target-sum);
                        }
                }
                if(sum<target){ 
                    l++;
                    if(Math.abs(target-sum)<min) {
                        res = sum;
                        min = Math.abs(target-sum);
                        }
                              }
                else if(sum == target) {
                   return sum;
                }
            }
        }
        return res;
    }
}
