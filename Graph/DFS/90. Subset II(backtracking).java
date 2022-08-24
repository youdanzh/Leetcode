class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path= new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums,0);
        return res;
    }
    void dfs(int[] nums, int idx){
        res.add(new LinkedList<>(path));
        for(int i = idx ;i<nums.length;i++){
            if(i>idx&& nums[i] == nums[i-1]) continue;
            path.addLast(nums[i]);
            dfs(nums,i+1);
            path.removeLast();
        }
    }
}
