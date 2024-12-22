# Search in a Row-Column Sorted Matrix

## Problem Statement

Given a 2D integer matrix `mat[][]` of size `n x m`, where every row and column is sorted in increasing order, and a number `x`, the task is to determine whether the element `x` is present in the matrix.

---

## Examples

### Example 1
- **Input**:  
  `mat[][] = [[3, 30, 38], [20, 52, 54], [35, 60, 69]], x = 62`
- **Output**:  
  `false`
- **Explanation**:  
  The element `62` is not present in the matrix.

---

### Example 2
- **Input**:  
  `mat[][] = [[18, 21, 27], [38, 55, 67]], x = 55`
- **Output**:  
  `true`
- **Explanation**:  
  The element `55` is present in the matrix.

---

### Example 3
- **Input**:  
  `mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], x = 3`
- **Output**:  
  `true`
- **Explanation**:  
  The element `3` is present in the matrix.

---

## Constraints
- `1 ≤ n, m ≤ 1000`
- `1 ≤ mat[i][j] ≤ 10⁹`
- `1 ≤ x ≤ 10⁹`
