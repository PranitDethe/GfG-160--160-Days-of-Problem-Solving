class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int maximum = 0;
        int minimum = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            minimum = Math.min(minimum,price);
            int profit = price - minimum;
            maximum = Math.max(maximum, profit);
        }
        return maximum;
    }
}
