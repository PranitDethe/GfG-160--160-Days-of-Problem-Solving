class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int lastEndTime = Integer.MIN_VALUE;
        
        for(int [] interval : intervals) {
            if(interval[0] >= lastEndTime) {
                lastEndTime = interval[1];
                count++;
            }
        }
        return intervals.length - count;
    }
}
