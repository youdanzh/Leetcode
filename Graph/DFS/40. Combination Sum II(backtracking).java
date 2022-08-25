class Solution {
   List<List<Integer>> res = new LinkedList<>();
LinkedList<Integer> track = new LinkedList<>();
int trackSum = 0;

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    if (candidates.length == 0) return res;
    Arrays.sort(candidates);
    backtrack(candidates, 0, target);
    return res;
}
void backtrack(int[] nums, int start, int target) {
    if (trackSum == target) {
        res.add(new LinkedList<>(track));
        return;
    }
    if (trackSum > target) {
        return;
    }

    // 回溯算法标准框架
    for (int i = start; i < nums.length; i++) {
        if (i > start && nums[i] == nums[i - 1]) {
            continue;
        }
        track.add(nums[i]);
        trackSum += nums[i];
        backtrack(nums, i + 1, target);
        track.removeLast();
        trackSum -= nums[i];
    }
}
}
