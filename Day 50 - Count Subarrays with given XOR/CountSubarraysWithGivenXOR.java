class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        long res = 0;
        Map<Integer, Integer> map = new HashMap();
        int currXOR = 0;
        map.put(0, 1);
        
        for (int i : arr) {
            currXOR = currXOR^i;
            
            if(map.containsKey(currXOR^k)) {
                res += map.get(currXOR^k);
            }
            map.put(currXOR, map.getOrDefault(currXOR, 0) + 1);
        }
        
        return res;
    }
}
