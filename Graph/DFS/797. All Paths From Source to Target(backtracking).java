class Solution {
     List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        dfs(graph,0,path);
        return res;
    }
    void dfs(int[][] graph, int s , LinkedList<Integer> path){
        path.addLast(s);
        int n = graph.length;
        if(s == n-1) {
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }
        for (int v : graph[s]) {
            dfs(graph, v, path);
        }

        path.removeLast();
    }
}
