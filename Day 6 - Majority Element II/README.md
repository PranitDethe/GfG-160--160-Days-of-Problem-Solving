# Majority Element II

## Problem Statement

You are given an array of integers `arr[]` where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes. If there are no candidates with a majority vote, return an empty array.

**Note**: The result should be returned in an increasing order.

---

## Examples

### Example 1
- **Input**: 
  - `arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]`
- **Output**: 
  - `[5, 6]`
- **Explanation**: Candidates `5` and `6` occur more than `n/3` times.

### Example 2
- **Input**: 
  - `arr[] = [1, 2, 3, 4, 5]`
- **Output**: 
  - `[]`
- **Explanation**: No candidate occurs more than `n/3` times.

---

## Constraints
1. `1 ≤ arr.size() ≤ 10^6`
2. `0 ≤ arr[i] ≤ 10^9`
