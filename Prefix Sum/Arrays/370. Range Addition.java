class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for(int[] u: updates){
            int s = u[0];
            int e = u[1];
            int i = u[2];
            res[s]+=i;
            if(e+1<length){
                res[e+1]-=i;
            }
        }
        for(int i = 1;i<length;i++){
            res[i]+= res[i-1];
        }
        return res;
    }
}
