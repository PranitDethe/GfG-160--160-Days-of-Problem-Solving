# Longest Consecutive Subsequence

## Problem Statement
Given an array `arr[]` of non-negative integers, find the length of the longest subsequence such that elements in the subsequence are consecutive integers. The consecutive numbers can appear in any order.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [2, 6, 1, 9, 4, 5, 3]`
- **Output**:  
  `6`
- **Explanation**:  
  The consecutive numbers are `1, 2, 3, 4, 5, 6`. The length of this subsequence is `6`.

---

### Example 2
- **Input**:  
  `arr[] = [1, 9, 3, 10, 4, 20, 2]`
- **Output**:  
  `4`
- **Explanation**:  
  The longest consecutive subsequence is `1, 2, 3, 4`. The length of this subsequence is `4`.

---

### Example 3
- **Input**:  
  `arr[] = [15, 13, 12, 14, 11, 10, 9]`
- **Output**:  
  `7`
- **Explanation**:  
  The longest consecutive subsequence is `9, 10, 11, 12, 13, 14, 15`. The length of this subsequence is `7`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`
