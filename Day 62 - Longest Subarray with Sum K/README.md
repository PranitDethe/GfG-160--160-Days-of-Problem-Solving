# Longest Subarray with Sum K

## Problem Description
Given an array `arr[]` containing integers and an integer `k`, your task is to find the **length of the longest subarray** where the sum of its elements equals the given value `k`.  
If there is no subarray with a sum equal to `k`, return `0`.

---

## Examples

### Example 1
**Input:**  
arr[] = [10, 5, 2, 7, 1, -10], k = 15  

**Output:**  
6  

**Explanation:**  
Subarrays with sum = 15 are:  
- [5, 2, 7, 1]  
- [10, 5]  
- [10, 5, 2, 7, 1, -10]  

The length of the longest subarray with a sum of 15 is `6`.

---

### Example 2
**Input:**  
arr[] = [-5, 8, -14, 2, 4, 12], k = -5  

**Output:**  
5  

**Explanation:**  
The only subarray with sum = -5 is `[-5, 8, -14, 2, 4]`, with a length of `5`.

---

### Example 3
**Input:**  
arr[] = [10, -10, 20, 30], k = 5  

**Output:**  
0  

**Explanation:**  
No subarray with a sum of `5` is present in `arr[]`.

---

## Constraints
- 1 ≤ arr.size() ≤ 10⁵  
- -10⁴ ≤ arr[i] ≤ 10⁴  
- -10⁹ ≤ k ≤ 10⁹  
