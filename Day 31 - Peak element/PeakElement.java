class Solution {

    public int peakElement(int[] arr) {
        // code here
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            boolean isLeftSmaller = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean isRightSmaller = (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return mid;
            }

            // If left neighbor is greater, move to the left half
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else { 
                // Else move to the right half
                left = mid + 1;
            }
        }
        
        return -1; // Shouldn't reach here as a peak element is guaranteed to exist
    
    }
}
