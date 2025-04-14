class Solution {
    public String findOrder(String[] words) {
        // code here
        Map<Character, List<Character>> adj = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();
        
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                adj.putIfAbsent(ch, new ArrayList<>());
                inDegree.putIfAbsent(ch, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            boolean foundDiff = false;
            
            for (int j = 0; j < Math.min(w1. length(), w2.length()); j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if (c1 != c2) {
                    adj.get(c1).add(c2);
                    inDegree.put(c2, inDegree.get(c2) + 1);
                    foundDiff = true;
                    break;
                }
            }
            if (!foundDiff && w1.length() > w2.length()) {
                return "";
            }
        }
        Queue<Character> q = new LinkedList<>();
        for (char ch : inDegree.keySet()) {
            if (inDegree.get(ch) == 0) {
                q.offer(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!q.isEmpty()) {
            char current = q.poll();
            result.append(current);
            for (char neighbor : adj.get(current)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    q.offer(neighbor);
                }
            }
        }
        if (result.length() != inDegree.size()) {
            return "";
        }
        return result.toString();
    }
}
