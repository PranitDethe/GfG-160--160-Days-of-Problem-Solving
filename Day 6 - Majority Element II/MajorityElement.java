class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        TreeMap<Integer, Integer> h = new TreeMap<>();
        
        for(int i : nums) {
            if(h.containsKey(i)) {
                int value = h.get(i);
                h.put(i,value+1);
            } else {
                h.put(i,1);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int check = nums.length/3;
        
        for(Integer key : h.keySet()) {
            int vote = h.get(key);
            if(vote > check) {
                ans.add(key);
            }
        }
        
        return ans;
    }
}
