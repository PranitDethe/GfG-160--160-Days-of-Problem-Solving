# Indexes of Subarray Sum

## Problem Description
Given an array `arr[]` containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value `target`. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. If no such subarray exists, return `[-1]`.

---

## Examples

### Example 1
**Input:**  
arr[] = [1, 2, 3, 7, 5]  
target = 12  

**Output:**  
[2, 4]  

**Explanation:**  
The sum of elements from the 2nd to 4th position is 12.

---

### Example 2
**Input:**  
arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  
target = 15  

**Output:**  
[1, 5]  

**Explanation:**  
The sum of elements from the 1st to 5th position is 15.

---

### Example 3
**Input:**  
arr[] = [5, 3, 4]  
target = 2  

**Output:**  
[-1]  

**Explanation:**  
There is no subarray with sum equal to 2.

---

## Constraints
- 1 ≤ arr.size() ≤ 10^6  
- 0 ≤ arr[i] ≤ 10^3  
- 0 ≤ target ≤ 10^9
