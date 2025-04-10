class Solution {

    public int minCost(int[][] houses) {
        // code here
        int n = houses.length;
        boolean[] visited = new boolean[n];
        int[] minDist = new int[n];
        Arrays.fill(minDist, Integer.MAX_VALUE);
        minDist[0] = 0;
        
        int cost = 0;
        
        for (int i = 0; i < n; i++) {
            int u = -1;
            
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || minDist[j] < minDist[u])) {
                    u = j;
                }
            }
            visited[u] = true;
            cost += minDist[u];
            
            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int dist = Math.abs(houses[u][0] - houses[v][0]) + Math.abs(houses[u][1] - houses[v][1]);
                    minDist[v] = Math.min(minDist[v], dist);
                }
            }
        }
        return cost;
        
    }
}
