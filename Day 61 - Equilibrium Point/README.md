# Equilibrium Point

## Problem Description
Given an array of integers `arr[]`, the task is to find the **first equilibrium point** in the array.

An **equilibrium point** in an array is an index (0-based indexing) such that the sum of all elements before that index is equal to the sum of all elements after it.  
If no such point exists, return `-1`.

---

## Examples

### Example 1
**Input:**  
arr[] = [1, 2, 0, 3]  

**Output:**  
2  

**Explanation:**  
The sum of elements left of index 2 is `1 + 2 = 3`, and the sum of elements right of index 2 is also `3`.

---

### Example 2
**Input:**  
arr[] = [1, 1, 1, 1]  

**Output:**  
-1  

**Explanation:**  
There is no index where the sum of elements on the left is equal to the sum on the right.

---

### Example 3
**Input:**  
arr[] = [-7, 1, 5, 2, -4, 3, 0]  

**Output:**  
3  

**Explanation:**  
The sum of elements left of index 3 is `-7 + 1 + 5 = -1`, and the sum of elements right of index 3 is `-4 + 3 + 0 = -1`.

---

## Constraints
- 3 ≤ arr.size() ≤ 10⁵  
- -10⁴ ≤ arr[i] ≤ 10⁴  
