class Solution {
    static ArrayList<ArrayList<String>> accountsMerge(
        ArrayList<ArrayList<String>> accounts) {
        // code here
        Map<String, Set<String>> graph = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        
        for (ArrayList<String> account : accounts) {
            String name = account.get(0);
            for(int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                
                graph.putIfAbsent(account.get(1), new HashSet<>());
                graph.putIfAbsent(email, new HashSet<>());
                graph.get(account.get(1)).add(email);
                graph.get(email).add(account.get(1));
            }
        }
        Set<String> visited = new HashSet<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        
        for (String email : graph.keySet()) {
            if (!visited.contains(email)) {
                ArrayList<String> component = new ArrayList<>();
                dfs(email, graph, visited, component);
                Collections.sort(component);
                component.add(0, emailToName.get(email));
                result.add(component);
            }
        }
        return result;
    }
    static void dfs(String email, Map<String, Set<String>> graph, Set<String> visited, ArrayList<String> component) {
        visited.add(email);
        component.add(email);
        for(String neighbor : graph.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }
}
