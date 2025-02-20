class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double> medians = new ArrayList<>();
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int start = 0;
        
        for(int i = start; i < arr.length; i++) {
            int num = arr[i];
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else  if(minHeap.size() > maxHeap.size()){
               maxHeap.offer(minHeap.poll());
            }
            if (maxHeap.size() == minHeap.size()) {
                medians.add((maxHeap.peek() + minHeap.peek()) / 2.0);
            } else {
                medians.add((double) maxHeap.peek());
            }
        }
        return medians;
    }
}
