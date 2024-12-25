# Set Matrix Zeroes

## Problem Statement

You are given a 2D matrix `mat[][]` of size `n × m`. The task is to modify the matrix such that if `mat[i][j]` is `0`, all the elements in the `i`-th row and `j`-th column are set to `0`. The implementation should have **constant space complexity**.

---

## Examples

### Example 1
- **Input**:  
  `mat[][] = [[1, -1, 1], [-1, 0, 1], [1, -1, 1]]`
- **Output**:  
  `[[1, 0, 1], [0, 0, 0], [1, 0, 1]]`
- **Explanation**:  
  Since `mat[1][1] = 0`, all elements in row `1` and column `1` are updated to `0`.

---

### Example 2
- **Input**:  
  `mat[][] = [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]`
- **Output**:  
  `[[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]`
- **Explanation**:  
  Since `mat[0][0]` and `mat[0][3]` are `0`, all elements in row `0`, column `0`, and column `3` are updated to `0`.

---

## Constraints
- `1 ≤ n, m ≤ 500`
- `-2^31 ≤ mat[i][j] ≤ 2^31 - 1`
