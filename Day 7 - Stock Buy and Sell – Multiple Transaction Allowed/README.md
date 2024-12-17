# Stock Buy and Sell – Multiple Transactions Allowed

## Problem Statement

The cost of stock on each day is given in an array `prices[]`. On any given day, you may decide to either **buy** or **sell** the stock at `prices[i]`. You are allowed to **buy and sell on the same day**. The goal is to find the **maximum profit** you can achieve.

### Rules:
- A stock can **only be sold** if it has been bought previously.
- You cannot hold multiple stocks on the same day.

---

## Examples

### Example 1
- **Input**:  
  `prices[] = [100, 180, 260, 310, 40, 535, 695]`
- **Output**:  
  `865`
- **Explanation**:  
  - Buy the stock on **day 0** and sell it on **day 3**: `310 - 100 = 210`.  
  - Buy the stock on **day 4** and sell it on **day 6**: `695 - 40 = 655`.  
  - Total Maximum Profit = `210 + 655 = 865`.

### Example 2
- **Input**:  
  `prices[] = [4, 2, 2, 2, 4]`
- **Output**:  
  `2`
- **Explanation**:  
  - Buy the stock on **day 3** and sell it on **day 4**: `4 - 2 = 2`.  
  - Total Maximum Profit = `2`.

---

## Constraints
1. `1 <= prices.size() <= 10^5`
2. `0 <= prices[i] <= 10^4`
