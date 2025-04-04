class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size(); 
        boolean[] visited = new boolean[n]; 
        ArrayList<Integer> result = new ArrayList<>(); 
        Queue<Integer> queue = new LinkedList<>(); 
        
        queue.add(0);
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return result;
    }
}
