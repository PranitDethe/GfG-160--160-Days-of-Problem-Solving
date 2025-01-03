# Count Subarrays with Given XOR

## Problem Statement
Given an array of integers `arr[]` and a number `k`, count the number of subarrays having the XOR of their elements equal to `k`.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [4, 2, 2, 6, 4], k = 6`
- **Output**:  
  `4`
- **Explanation**:  
  The subarrays having XOR of their elements as `6` are:  
  - `[4, 2]`  
  - `[4, 2, 2, 6, 4]`  
  - `[2, 2, 6]`  
  - `[6]`  

---

### Example 2
- **Input**:  
  `arr[] = [5, 6, 7, 8, 9], k = 5`
- **Output**:  
  `2`
- **Explanation**:  
  The subarrays having XOR of their elements as `5` are:  
  - `[5]`  
  - `[5, 6, 7, 8, 9]`  

---

### Example 3
- **Input**:  
  `arr[] = [1, 1, 1, 1], k = 0`
- **Output**:  
  `4`
- **Explanation**:  
  The subarrays having XOR of their elements as `0` are:  
  - `[1, 1]`  
  - `[1, 1]`  
  - `[1, 1]`  
  - `[1, 1, 1, 1]`  

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`
- `0 ≤ k ≤ 10^5`
