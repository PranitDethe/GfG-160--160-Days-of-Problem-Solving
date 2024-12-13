class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int i = n - 2;
        
        while(i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }
        if(i >= 0) {
            int j = n-1;
            while(arr[j] <= arr[i]) {
                j--;
            }
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        int a = i + 1;
        int b = n - 1;
        
        while(a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
