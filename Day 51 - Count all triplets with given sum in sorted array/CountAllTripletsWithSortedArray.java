class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            
            while(j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                
                if(sum == target) {
                    count++;
                    int temp = j + 1;
                    
                    while (temp < k && arr[temp] == arr[temp - 1]) {
                        count++;
                        temp++;
                    }
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}
