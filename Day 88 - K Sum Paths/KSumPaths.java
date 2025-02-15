class Solution {
    public int sumK(Node root, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); 
        return dfs(root, 0, k, prefixSumMap);
    }

    private int dfs(Node node, int currSum, int k, HashMap<Integer, Integer> prefixSumMap) {
        if (node == null) return 0;

        currSum += node.data;

        int count = prefixSumMap.getOrDefault(currSum - k, 0);

        prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);

        count += dfs(node.left, currSum, k, prefixSumMap);
        count += dfs(node.right, currSum, k, prefixSumMap);

        prefixSumMap.put(currSum, prefixSumMap.get(currSum) - 1);

        return count;
    }
}
