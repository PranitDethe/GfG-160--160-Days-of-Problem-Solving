class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            
            if((u == c && v == d) || (u == d && v == c)) continue;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        dfs(c, adj, visited);
        
        return !visited[d];
    
    }
    private void dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        visited[u] = true;
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(v, adj, visited);
            }
        }
    }
}
