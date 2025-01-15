class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;

        // Calculate total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Initialize left sum as 0
        int leftSum = 0;

        // Traverse the array and check for equilibrium point
        for (int i = 0; i < n; i++) {
            // Calculate right sum as totalSum - leftSum - arr[i]
            int rightSum = totalSum - leftSum - arr[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Return the equilibrium index
            }

            // Update left sum by adding the current element
            leftSum += arr[i];
        }

        // If no equilibrium point is found, return -1
        return -1;
    }
}
