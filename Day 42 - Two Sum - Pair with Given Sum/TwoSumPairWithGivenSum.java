class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> complements = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (complements.containsKey(arr[i])) {
                return true;
            }
            complements.put(target - arr[i], i);
        }
        return false;
    }
}
