class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for(int i = 0 ; i <nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l = i+1,r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum>0) r--;
                if(sum<0) l++;
                else if(sum == 0) {
                    res.add(new LinkedList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    l++;
                    while(nums[l]==nums[l-1]&&l<r) l++;
                }
            }
        }
        return res;
    }
}
