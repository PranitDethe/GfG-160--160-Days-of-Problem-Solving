# Count Pairs Whose Sum is Less Than Target

## Problem Description
Given an array `arr[]` of integers and an integer `target`, your task is to find the **number of pairs** `(i, j)` in the array such that:

- `arr[i] + arr[j] < target`
- `i < j`

The goal is to count all such pairs in the array.

---

## Examples

### Example 1
**Input:**  
`arr[] = [7, 2, 5, 3]`  
`target = 8`

**Output:**  
`2`

**Explanation:**  
The pairs whose sum is strictly less than `8` are:  
- `(2, 5)`
- `(2, 3)`

---

### Example 2
**Input:**  
`arr[] = [5, 2, 3, 2, 4, 1]`  
`target = 5`

**Output:**  
`4`

**Explanation:**  
The pairs whose sum is strictly less than `5` are:  
- `(2, 2)`
- `(2, 1)`
- `(3, 1)`
- `(2, 1)`

---

### Example 3
**Input:**  
`arr[] = [2, 1, 8, 3, 4, 7, 6, 5]`  
`target = 7`

**Output:**  
`6`

**Explanation:**  
The pairs whose sum is strictly less than `7` are:  
- `(2, 1)`
- `(2, 3)`
- `(2, 4)`
- `(1, 3)`
- `(1, 4)`
- `(1, 5)`

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^4`
- `1 ≤ target ≤ 10^4`
