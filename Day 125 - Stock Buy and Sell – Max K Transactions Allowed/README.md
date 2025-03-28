# Stock Buy and Sell – Max K Transactions Allowed

 
## Problem Statement
In the stock market, a person buys a stock and sells it on some future date. You are given an array `prices[]` representing stock prices on different days and a positive integer `k`. The task is to find out the maximum profit a person can make in at-most `k` transactions.

A transaction consists of buying and subsequently selling a stock, and a new transaction can start only when the previous transaction has been completed.

## Examples

### Example 1:
**Input:**  
```
prices[] = [10, 22, 5, 80], k = 2
```
**Output:**  
```
87
```
**Explanation:**  
1st transaction: Buy at 10 and sell at 22.  
2nd transaction: Buy at 5 and sell at 80.  
Total Profit will be **12 + 75 = 87**.

---

### Example 2:
**Input:**  
```
prices[] = [20, 580, 420, 900], k = 3
```
**Output:**  
```
1040
```
**Explanation:**  
1st transaction: Buy at 20 and sell at 580.  
2nd transaction: Buy at 420 and sell at 900.  
Total Profit will be **560 + 480 = 1040**.

---

### Example 3:
**Input:**  
```
prices[] = [100, 90, 80, 50, 25],  k = 1
```
**Output:**  
```
0
```
**Explanation:**  
Selling price is decreasing continuously, leading to loss. So, the seller cannot make any profit.

## Constraints
- `1 ≤ prices.size() ≤ 10^3`
- `1 ≤ k ≤ 200`
- `1 ≤ prices[i] ≤ 10^3`

