class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n : arr) {
            int complement = target - n;
            if(map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return count;
    }
}
