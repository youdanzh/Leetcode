
 class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i <nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j = i+1 ; j <nums.length;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int l = j+1,r = nums.length-1;
                long sum2 = (long)nums[i]+(long)nums[j];
                while(l<r&&r<nums.length){
                    long sum4 = sum2 +(long)nums[l]+ (long)nums[r];
                    if(sum4 >(long)target) r--;
                    if(sum4 < (long)target) l++;
                    else if(sum4 == (long)target ){
                        res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[l],nums[r])));
                        l++;
                        r--;
                        while(l<r&&nums[l]==nums[l-1]) l++;
                    }
                }
            
            
        }
        }
        return res;
    }
}
//注意整形溢出
