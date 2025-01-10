class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int left = 0;
        int right = k - 1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int distinct = 0;
        
        for (int i = 0; i <= right; i++) {
            if(!count.containsKey(arr[i])) {
                distinct++;
                count.put(arr[i],1);
            } else {
                count.put(arr[i], count.get(arr[i]) + 1);
            }
        }
        ans.add(distinct);
        
        while(left <= right && right < arr.length) {
            right++;
            if(right == arr.length) break;
            int incoming = arr[right];
            if (count.containsKey(incoming) && count.get(incoming)!=0)count.put(incoming, count.get(incoming) + 1);
            
         else {
            distinct++;
            count.put(incoming, 1);
        }
        int outgoing = arr[left];
        count.put(outgoing, count.get(outgoing) - 1);
        if(count.get(outgoing) == 0) distinct--;
        left++;
        ans.add(distinct);
    }
    return(ans);
}
}
