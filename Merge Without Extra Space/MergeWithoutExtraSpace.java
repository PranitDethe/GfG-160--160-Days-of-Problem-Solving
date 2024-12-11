class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        
        for (int i = n -1, j = 0; i >= 0 && j < m; i--, j++) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            } else {
                break;
            }
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
