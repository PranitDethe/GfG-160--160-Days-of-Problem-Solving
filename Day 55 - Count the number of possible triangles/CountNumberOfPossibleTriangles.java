class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for (int k = 2; k < arr.length; k++) {
            int i = 0; 
            int j = k - 1;
            
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += j - i;
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}
