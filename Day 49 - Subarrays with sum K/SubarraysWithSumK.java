class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0,1);
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - k;
            count += map.getOrDefault(rem,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}
