# Spirally Traversing a Matrix

## Problem Statement

You are given a rectangular matrix `mat[][]` of size `n x m`. The task is to traverse the matrix in a **spiral order** and return the elements in a 1D array.

---

## Examples

### Example 1
- **Input**:  
  `mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]`
- **Output**:  
  `[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]`
- **Explanation**:  
  Traversing the matrix spirally gives the output as shown above.

### Example 2
- **Input**:  
  `mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]`
- **Output**:  
  `[1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]`
- **Explanation**:  
  Traversing the matrix spirally gives the output as shown above.

### Example 3
- **Input**:  
  `mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]`
- **Output**:  
  `[32, 44, 27, 23, 62, 50, 28, 54]`
- **Explanation**:  
  Applying the same spiral traversal technique, the output is `[32, 44, 27, 23, 62, 50, 28, 54]`.

---

## Constraints
- `1 <= n, m <= 1000`
- `0 <= mat[i][j] <= 100`

---

## Expected Complexity
- **Time Complexity**: `O(n * m)`
- **Auxiliary Space**: `O(1)` (excluding the space for the output array)
