# Find All Triplets with Zero Sum

## Problem Statement
Given an array `arr[]`, find all possible triplets `(i, j, k)` in the array such that the sum of elements at these indices equals zero. The returned triplets should also satisfy the condition `i < j < k`.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [0, -1, 2, -3, 1]`
- **Output**:  
  `[[0, 1, 4], [2, 3, 4]]`
- **Explanation**:  
  Triplets with sum 0 are:  
  - `arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0`  
  - `arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0`

---

### Example 2
- **Input**:  
  `arr[] = [1, -2, 1, 0, 5]`
- **Output**:  
  `[[0, 1, 2]]`
- **Explanation**:  
  Only triplet which satisfies the condition is:  
  - `arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0`

---

### Example 3
- **Input**:  
  `arr[] = [2, 3, 1, 0, 5]`
- **Output**:  
  `[]`
- **Explanation**:  
  There is no triplet with sum 0.

---

## Constraints
- `3 ≤ arr.size() ≤ 10^3`
- `-10^4 ≤ arr[i] ≤ 10^4`
