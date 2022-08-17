
    public int[] twoSum(int[] nums, int target) {
        int l = 0 , r = nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            int sum =nums[l]+nums[r];
            if(sum<target) l++;
            if(sum>target) r--;
            else if(sum == target) return new int[]{nums[l],nums[r]};
        }
        return new int[]{};
    }
