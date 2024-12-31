class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n - 1];
        int [] freq = new int[max + 1];
        
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        
        int count = 0;
        int max1 = Integer.MIN_VALUE;
        
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                count++;
                max1 = Math.max(max1, count);
            } else count = 0;
        }
        return max1;
    }
}
