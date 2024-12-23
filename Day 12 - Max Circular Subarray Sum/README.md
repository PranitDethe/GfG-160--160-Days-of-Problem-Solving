# Max Circular Subarray Sum

## Problem Statement

Given an array of integers `arr[]` arranged in a circular fashion, the task is to find the maximum subarray sum that can be obtained by considering the array as circular.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [8, -8, 9, -9, 10, -11, 12]`
- **Output**:  
  `22`
- **Explanation**:  
  Starting from the last element of the array, i.e., `12`, and moving in a circular fashion, we have the maximum subarray as `[12, 8, -8, 9, -9, 10]`, which gives a maximum sum of `22`.

---

### Example 2
- **Input**:  
  `arr[] = [10, -3, -4, 7, 6, 5, -4, -1]`
- **Output**:  
  `23`
- **Explanation**:  
  The maximum sum of the circular subarray is `23`. The subarray is `[7, 6, 5, -4, -1, 10]`.

---

### Example 3
- **Input**:  
  `arr[] = [-1, 40, -14, 7, 6, 5, -4, -1]`
- **Output**:  
  `52`
- **Explanation**:  
  The circular subarray `[7, 6, 5, -4, -1, -1, 40]` has the maximum sum, which is `52`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10⁵`
- `-10⁴ ≤ arr[i] ≤ 10⁴`
