# Stock Buy and Sell – Max One Transaction Allowed

## Problem Statement

Given an array `prices[]` of length `n`, representing the prices of stocks on different days, the task is to find the **maximum profit** possible by buying and selling the stock on different days when **at most one transaction is allowed**. A transaction consists of one **buy** and one **sell**. 

If it is not possible to make a profit, return `0`.

### Note:
- The stock must be bought **before** being sold.
- At most one transaction is allowed.

---

## Examples

### Example 1
- **Input**:  
  `prices[] = [7, 10, 1, 3, 6, 9, 2]`
- **Output**:  
  `8`
- **Explanation**:  
  You can buy the stock on day 2 at `price = 1` and sell it on day 5 at `price = 9`. Hence, the profit is `9 - 1 = 8`.

### Example 2
- **Input**:  
  `prices[] = [7, 6, 4, 3, 1]`
- **Output**:  
  `0`
- **Explanation**:  
  The prices are in decreasing order. Hence, it is not possible to make any profit.

### Example 3
- **Input**:  
  `prices[] = [1, 3, 6, 9, 11]`
- **Output**:  
  `10`
- **Explanation**:  
  Since the prices are sorted in increasing order, you can make the maximum profit by buying at `price[0]` and selling at `price[n-1]`. The profit is `11 - 1 = 10`.

---

## Constraints
1. `1 <= prices.size() <= 10^5`
2. `0 <= prices[i] <= 10^4`
