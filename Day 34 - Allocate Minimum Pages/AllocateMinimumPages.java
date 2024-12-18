class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n < k) return -1;
        
        int low = 0, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    
    private static boolean isPossible(int[] arr, int k, int maxPages) {
        int studentCount = 1, currentSum = 0;
        
        for (int pages : arr) {
            if (currentSum + pages > maxPages) {
                studentCount++;
                currentSum = pages;
                
                if (studentCount > k) {
                    return false;
                }
            } else {
                currentSum += pages;
            }
        }
        return true;
    }
}