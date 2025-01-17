class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int right = arr[arr.length - 1];
        int lp[] = new int [arr.length];
        lp[0] = 1;
        
        for(int i = 1; i < arr.length; i++) {
            lp[i] = lp[i - 1]*arr[i - 1];
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            lp[i] *= right;
            right *= arr[i];
        }
        return lp;
    }
}
