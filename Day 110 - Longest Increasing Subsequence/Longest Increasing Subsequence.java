class Solution {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        if(n == 0) return 0;
        
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        
        for (int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int maxLIS = 0;
        for (int val : dp) {
            maxLIS = Math.max(maxLIS, val);
        }
        return maxLIS;
        
    }
    static int lisOptimized(int arr[]) {
        int n = arr.length;
        if(n == 0) return 0;
        
        int[] tail = new int[n];
        int len = 0;
        
        for (int num : arr) {
            int index = Arrays.binarySearch(tail, 0, len, num);
            if (index < 0) index = -(index + 1);
            tail[index] = num;
            if(index == len) len++;
        }
        return len;
    }
}
