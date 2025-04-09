class Solution {
    static int timer;
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        int[] tin = new int[V];
        int[] low = new int[V];
        boolean[] isArticulation = new boolean[V];
        timer = 0;
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(i, -1, visited, tin, low, adj, isArticulation);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) result.add(i);
        }
        if (result.isEmpty()) result.add(-1);
        Collections.sort(result);
        return result;
    }
    static void dfs(int u, int parent, boolean[] visited, int[] tin, int[] low, List<List<Integer>> adj, boolean[] isArticulation) {
        visited[u] = true;
        tin[u] = low[u] = timer++;
        int children = 0;
        
        for(int v : adj.get(u)) {
            if(v == parent) continue;
            
            if(!visited[v]) {
                dfs(v, u, visited, tin, low, adj, isArticulation);
                low[u] = Math.min(low[u], low[v]);
                
                if(low[v] >= tin[u] && parent != -1) {
                    isArticulation[u] = true;
                }
                children++;
            } else {
                low[u] = Math.min(low[u], tin[v]);
            }
        }
        if (parent == -1 && children > 1 ) {
            isArticulation[u] = true;
        }
    }
}
