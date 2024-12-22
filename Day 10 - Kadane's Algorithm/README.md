# Kadane's Algorithm

## Problem Statement

Given an integer array `arr[]`, your task is to find the **maximum sum of a subarray**. A subarray is a contiguous portion of the array.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [2, 3, -8, 7, -1, 2, 3]`
- **Output**:  
  `11`
- **Explanation**:  
  The subarray `{7, -1, 2, 3}` has the largest sum of `11`.

### Example 2
- **Input**:  
  `arr[] = [-2, -4]`
- **Output**:  
  `-2`
- **Explanation**:  
  The subarray `{-2}` has the largest sum of `-2`.

### Example 3
- **Input**:  
  `arr[] = [5, 4, 1, 7, 8]`
- **Output**:  
  `25`
- **Explanation**:  
  The subarray `{5, 4, 1, 7, 8}` has the largest sum of `25`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10⁵`
- `-10⁹ ≤ arr[i] ≤ 10⁴`

---

## Expected Complexity
- **Time Complexity**: `O(n)`
- **Space Complexity**: `O(1)`