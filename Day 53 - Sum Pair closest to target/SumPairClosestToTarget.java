class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList();
        int i =0;
        int j = arr.length - 1;
        int currentClose = Integer.MAX_VALUE;
        
        while ( i < j) {
            int sum = arr[i] + arr[j];
            if(Math.abs(target - sum) < currentClose) {
                currentClose = Math.abs(target - sum);
                ans.clear();
                ans.add(arr[i]);
                ans.add(arr[j]);
            }
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return ans;
            }
        }
        return ans;
    }
}
