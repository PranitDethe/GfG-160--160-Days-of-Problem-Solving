# Aggressive Cows

## Problem Statement

You are given an array with unique elements `stalls[]`, which denote the positions of stalls. You are also given an integer `k`, representing the number of aggressive cows.  

Your task is to assign stalls to `k` cows such that the **minimum distance** between any two of them is the **maximum possible**.

---

## Examples

### Example 1
- **Input**:  
  `stalls[] = [1, 2, 4, 8, 9]`, `k = 3`
- **Output**:  
  `3`
- **Explanation**:  
  - The first cow can be placed at `stalls[0]`.  
  - The second cow can be placed at `stalls[2]`.  
  - The third cow can be placed at `stalls[3]`.  
  The minimum distance between cows is `3`, which is the largest among all possible ways.

### Example 2
- **Input**:  
  `stalls[] = [10, 1, 2, 7, 5]`, `k = 3`
- **Output**:  
  `4`
- **Explanation**:  
  - The first cow can be placed at `stalls[0]`.  
  - The second cow can be placed at `stalls[1]`.  
  - The third cow can be placed at `stalls[4]`.  
  The minimum distance between cows is `4`, which is the largest among all possible ways.

### Example 3
- **Input**:  
  `stalls[] = [2, 12, 11, 3, 26, 7]`, `k = 5`
- **Output**:  
  `1`
- **Explanation**:  
  Each cow can be placed in any of the stalls since the number of stalls is exactly equal to the number of cows.  
  The minimum distance between cows is `1`, which is the largest among all possible ways.

---

## Constraints
1. `2 ≤ stalls.size() ≤ 10^6`
2. `0 ≤ stalls[i] ≤ 10^8`
3. `1 ≤ k ≤ stalls.size()`
