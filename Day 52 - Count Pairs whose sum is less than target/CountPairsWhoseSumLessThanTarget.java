class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int count = 0;
        
        while ( i < j) {
            if (arr[i] + arr[j] < target) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
