class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        int[] parent = new int[V];
        
        for(int i = 0; i < V; i++) {
            parent[i] = i;
        }
        
        for (int[] edge : edges) {
            if (union(parent, edge[0], edge[1])) {
                return true;
            }
        }
        return false;
    }
    private int find(int[] parent, int x) {
        if(parent[x] != x)
        parent[x] = find(parent, parent[x]);
        return parent[x];
    }
    
    private boolean union(int[] parent, int u, int v) {
        int pu = find(parent, u);
        int pv = find(parent, v);
        if (pu == pv) return true;
        parent[pu] = pv;
        return false;
    }
}
