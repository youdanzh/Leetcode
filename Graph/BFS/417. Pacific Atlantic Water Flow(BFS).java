class Solution {
    
    int [][] directions = new int [][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    int m;
    int n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        m = heights.length;
        n = heights[0].length;
        Queue<int []> pacific = new LinkedList<>();
        Queue<int []> atlantic = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            pacific.add(new int [] {0, i});
            atlantic.add(new int [] {m - 1, i});
        }
        for (int i = 0; i < m; i++) {
            pacific.add(new int [] {i, 0});
            atlantic.add(new int [] {i, n - 1});
        }
        boolean [][] pacificVisit = bfs(pacific, heights);
        boolean [][] atlanticVisit = bfs(atlantic, heights);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificVisit[i][j] && atlanticVisit[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
    
    
    public boolean [][] bfs(Queue<int []> q, int [][] heights) {
        boolean [][] visited = new boolean [m][n];
        while (!q.isEmpty()) {
            int [] node = q.poll();
            int x = node[0];
            int y = node[1];
            visited[x][y] = true;
            for (int [] direction : directions) {
                int newX = direction[0] + x;
                int newY = direction[1] + y;
                if (newX < 0 || newX >= m || newY < 0 || newY >= n || heights[newX][newY] < heights[x][y] || visited[newX][newY]) {
                    continue;
                }
                q.offer(new int [] {newX, newY});
                visited[newX][newY] = true;
            }
        }
        return visited;
    }
    }
