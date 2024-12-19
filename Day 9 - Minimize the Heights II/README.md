# Minimize the Heights II

## Problem Statement

You are given an array `arr[]` of size `n` denoting the heights of `n` towers and a positive integer `k`.  
For each tower, you must perform **exactly one** of the following operations:
1. Increase the height of the tower by `k`.
2. Decrease the height of the tower by `k`.

The objective is to find the **minimum possible difference** between the height of the shortest and the tallest towers after modifying each tower.  

**Note**:  
- It is compulsory to either increase or decrease the height of each tower by `k`.
- The resultant array must not contain any negative integers.

---

## Examples

### Example 1
- **Input**:  
  `k = 2, arr[] = {1, 5, 8, 10}`
- **Output**:  
  `5`
- **Explanation**:  
  Modify the array as `{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}`.  
  The difference between the largest and smallest heights is `8 - 3 = 5`.

### Example 2
- **Input**:  
  `k = 3, arr[] = {3, 9, 12, 16, 20}`
- **Output**:  
  `11`
- **Explanation**:  
  Modify the array as `{3+k, 9+k, 12-k, 16-k, 20-k} = {6, 12, 9, 13, 17}`.  
  The difference between the largest and smallest heights is `17 - 6 = 11`.

---

## Constraints
1. `1 ≤ k ≤ 10^7`
2. `1 ≤ n ≤ 10^5`
3. `1 ≤ arr[i] ≤ 10^7`

---

## Expected Complexity
- **Time Complexity**: `O(n*logn)`
- **Auxiliary Space**: `O(n)`
