class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0; 
        int maxLength = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum == k) {
                maxLength = i + 1;
            }
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }
        return maxLength;
    }
}
