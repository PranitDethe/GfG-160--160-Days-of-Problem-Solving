# Subarrays with Sum K

## Problem Statement
Given an unsorted array of integers, find the number of continuous subarrays having a sum exactly equal to a given number `k`.

---

## Examples

### Example 1
- **Input**:  
  `arr = [10, 2, -2, -20, 10], k = -10`
- **Output**:  
  `3`
- **Explanation**:  
  The subarrays with sum exactly equal to `-10` are:  
  - `arr[0...3]`  
  - `arr[1...4]`  
  - `arr[3...4]`

---

### Example 2
- **Input**:  
  `arr = [9, 4, 20, 3, 10, 5], k = 33`
- **Output**:  
  `2`
- **Explanation**:  
  The subarrays with sum exactly equal to `33` are:  
  - `arr[0...2]`  
  - `arr[2...4]`

---

### Example 3
- **Input**:  
  `arr = [1, 3, 5], k = 0`
- **Output**:  
  `0`
- **Explanation**:  
  There is no subarray with a sum equal to `0`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `-10^3 ≤ arr[i] ≤ 10^3`
- `-10^7 ≤ k ≤ 10^7`
