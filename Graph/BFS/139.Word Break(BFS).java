class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Set<String> set = new HashSet<>(wordDict);
        Queue<Integer> q  = new LinkedList<>();
        boolean[] visited= new boolean[n];
        q.add(0);
        while(!q.isEmpty()){
            int start = q.poll();
            if(visited[start]){
                continue;
            }
            for( int end = start +1; end<=n;end++){
                if(set.contains(s.substring(start,end))){
                    q.add(end);
                    if(end == s.length()){
                        return true;
                    }
                }
            }
             visited[start] = true;
        }
        return false;
    }
}
