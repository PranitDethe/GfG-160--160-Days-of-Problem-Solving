class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        int n = intervals.length;
        ArrayList<int[]> ans = new ArrayList<>();
        ArrayList<int[]> arr = new ArrayList<>();
        boolean flag = true;
        
        for(int[]x : intervals) {
            if (flag && x[0] > newInterval[0]) {
                arr.add(newInterval);
                flag = false;
            }
            arr.add(x);
        }
        
        if(flag) arr.add(newInterval);
        int i = 0;
        int start = arr.get(0)[0], end = arr.get(0)[1];
        
        while (i <= n) {
            if (arr.get(i)[0] > end) {
                ans.add(new int[]{start, end});
                start = arr.get(i)[0];
            }
            end = Math.max(end, arr.get(i)[1]);
            i++;
        }
        ans.add(new int[] {start, end});
        return ans;
    }
}
