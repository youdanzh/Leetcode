class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        if (nums.length == 0) {
            return res;
        }
        dfs(nums,target,0,0);
        return res;
    }
    void dfs(int[] nums, int target,int idx, int sum){
        if(sum == target) {
            res.add(new LinkedList<>(track));
            return;
        }
         if(sum > target) {
            return;
        }
        for(int i = idx;i<nums.length;i++){
            track.add(nums[i]);
            sum+=nums[i];
            dfs(nums,target,i,sum);
            sum-= nums[i];
            track.removeLast();
        }
    }
}
