# Maximum Product Subarray

## Problem Statement

Given an array `arr[]` that contains positive, negative integers, and possibly zeros, your task is to find the maximum product of a subarray within `arr[]`.

**Note**: It is guaranteed that the output fits in a 32-bit integer.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [-2, 6, -3, -10, 0, 2]`
- **Output**:  
  `180`
- **Explanation**:  
  The subarray with the maximum product is `{6, -3, -10}` with a product of `6 * (-3) * (-10) = 180`.

---

### Example 2
- **Input**:  
  `arr[] = [-1, -3, -10, 0, 6]`
- **Output**:  
  `30`
- **Explanation**:  
  The subarray with the maximum product is `{-3, -10}` with a product of `(-3) * (-10) = 30`.

---

### Example 3
- **Input**:  
  `arr[] = [2, 3, 4]`
- **Output**:  
  `24`
- **Explanation**:  
  For an array with all positive elements, the result is the product of all elements: `2 * 3 * 4 = 24`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10⁶`
- `-10 ≤ arr[i] ≤ 10`
