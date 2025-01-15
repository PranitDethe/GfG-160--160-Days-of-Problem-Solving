class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;

        // Two pointers
        int left = 0, right = n - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate area between the two lines
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
