class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        int n = arr.length;
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        int left = 0, maxLength = 0, startIndex = 0;
        
        for (int right = 0; right < n; right++) {
            freqMap.put(arr[right], freqMap.getOrDefault(arr[right],0) + 1);
            
            while (freqMap.lastKey() - freqMap.firstKey() > x) {
                if (freqMap.get(arr[left]) == 1) {
                    freqMap.remove(arr[left]);
                } else {
                    freqMap.put(arr[left], freqMap.get(arr[left]) - 1);
                }
                left++;
            }
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            result.add(arr[i]);
        }
        return result;
        
    }
}
