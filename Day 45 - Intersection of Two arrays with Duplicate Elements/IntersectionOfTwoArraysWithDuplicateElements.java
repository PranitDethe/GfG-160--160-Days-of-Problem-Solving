class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        
        for(int num : a) {
            setA.add(num);
        }
        
        for (int num : b) {
            if (setA.contains(num)) {
                result.add(num);
            }
        }
        intersection.addAll(result);
        return intersection;
    }
}
