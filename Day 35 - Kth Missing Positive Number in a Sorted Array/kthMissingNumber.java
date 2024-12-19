class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = 0;
        int i = 0;
        int ans = 1;
        
        while ( n < k) {
            if (i < arr.length && arr[i] == ans) {
                i++;
            } else {
                n++;
                if(n == k) {
                    return ans;
                }
            }
            ans++;
        }
        return ans;
    }
}
