# Coin Change (Count Ways)

 
## Problem Statement
Given an integer array `coins[]` representing different denominations of currency and an integer `sum`, find the number of ways you can make `sum` by using different combinations from `coins[]`.

**Note:**
- Assume that you have an infinite supply of each type of coin.
- You can use any coin as many times as you want.
- Answers are guaranteed to fit into a 32-bit integer.

## Examples

### Example 1:
**Input:**  
```
coins[] = [1, 2, 3], sum = 4
```
**Output:**  
```
4
```
**Explanation:**  
Four possible ways to make sum 4 are:
- [1, 1, 1, 1]
- [1, 1, 2]
- [2, 2]
- [1, 3]

### Example 2:
**Input:**  
```
coins[] = [2, 5, 3, 6], sum = 10
```
**Output:**  
```
5
```
**Explanation:**  
Five possible ways to make sum 10 are:
- [2, 2, 2, 2, 2]
- [2, 2, 3, 3]
- [2, 2, 6]
- [2, 3, 5]
- [5, 5]

### Example 3:
**Input:**  
```
coins[] = [5, 10], sum = 3
```
**Output:**  
```
0
```
**Explanation:**  
Since all coin denominations are greater than `sum`, no combination can make the target sum.

## Constraints
- `1 <= sum <= 10^3`
- `1 <= coins[i] <= 10^4`
- `1 <= coins.size() <= 10^3`

