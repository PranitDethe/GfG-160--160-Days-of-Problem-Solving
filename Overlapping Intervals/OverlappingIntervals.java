class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> merge = new ArrayList<>();
        
        for (int[] interval : arr) {
            if (merge.isEmpty() || merge.get(merge.size() -1)[1] < interval[0]) {
                merge.add(interval);
            } else {
                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1)[1], interval[1]);
                
            }
        }
        
        return merge;
    }
}
