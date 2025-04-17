class Solution {
    public int findMinCycle(int V, int[][] edges) {
        // code here
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w= edge[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        int minCycle = Integer.MAX_VALUE;
        
        for(int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            
            removeEdge(graph, u, v, w);
            
            int dist = dijkstra(graph, V, u, v);
            if (dist != Integer.MAX_VALUE) {
                minCycle = Math.min(minCycle, dist + w);
            }
            
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        return (minCycle == Integer.MAX_VALUE) ? -1 : minCycle;
    }
    private void removeEdge(List<List<int[]>> graph, int u, int v, int w) {
        graph.get(u).removeIf(nei -> nei[0] == v && nei[1] == w);
        graph.get(v).removeIf(nei -> nei[0] == u && nei[1] == w);
    }
    private int dijkstra(List<List<int[]>> graph, int V, int src, int dest) {
        int[] dist = new int [V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{src, 0});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], d = curr[1];
            
            if(u == dest) return d;
            
            for (int[] nei : graph.get(u)) {
                int v = nei[0], w = nei[1];
                if (dist[v] > d + w) {
                    dist[v] = d + w;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        return Integer.MAX_VALUE;
    }
};
