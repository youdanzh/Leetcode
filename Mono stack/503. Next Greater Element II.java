class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i = 0; i<n ;i++){
            while(!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                res[stack.peek()] = nums[i];
                stack.pop();
            }
            stack.push(i);
        }
        for(int i = 0; i<n ;i++){
            while(!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                res[stack.peek()] = nums[i];
                stack.pop();
            }
        }//解决循环搜索
        return res;
    }
}
