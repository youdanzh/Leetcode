
class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int i =0,j=n;
        int res = 0;
        while(i<j){
            int w= j-i;
            int h = Math.min(height[i],height[j]);
            res= Math.max(res,w*h);
            if(height[i]<=height[j]) i++;
            else j--;      
        }
        return res;
    }
}
