class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        return map.containsKey(target)?map.get(target):0;
    }
}
