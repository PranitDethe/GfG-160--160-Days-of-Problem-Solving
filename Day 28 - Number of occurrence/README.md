# Number of Occurrence

## Problem Statement

Given a sorted array `arr[]` and a number `target`, find the number of occurrences of `target` in `arr[]`.

---

## Examples

### Example 1
- **Input**: 
  - `arr[] = [1, 1, 2, 2, 2, 2, 3]`
  - `target = 2`
- **Output**: 
  - `4`
- **Explanation**: The number `2` occurs 4 times in the given array.

### Example 2
- **Input**: 
  - `arr[] = [1, 1, 2, 2, 2, 2, 3]`
  - `target = 4`
- **Output**: 
  - `0`
- **Explanation**: The number `4` is not present in the given array, so the output is `0`.

### Example 3
- **Input**: 
  - `arr[] = [8, 9, 10, 12, 12, 12]`
  - `target = 12`
- **Output**: 
  - `3`
- **Explanation**: The number `12` occurs 3 times in the given array.

---

## Constraints
1. `1 ≤ arr.size() ≤ 10^6`
2. `1 ≤ arr[i] ≤ 10^6`
3. `1 ≤ target ≤ 10^6`
