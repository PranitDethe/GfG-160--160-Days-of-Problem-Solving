class Solution {
    public int maxLen(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLength = 0; 
        int prefixSum = 0; 

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i]; -

            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
