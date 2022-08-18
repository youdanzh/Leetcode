class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length/2;
        for(int a: arr){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        if(map.size() == 1) return 1;
        int count = 0 ;
        List<Integer> counts = new ArrayList<>(map.values());
        Collections.sort(counts);
        Collections.reverse(counts);
        int cnt = 0;
        int res = 0;
        for(int v :counts){
            cnt+=v;
            res++;
            if(cnt>=n)
                break;
            
            
        }
        return res;
    }
}
