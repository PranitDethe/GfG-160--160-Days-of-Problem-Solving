# Solve the Sudoku

## Problem Description
Given an incomplete Sudoku configuration as a **9x9** integer matrix `mat[][]`, the task is to solve the Sudoku.  
It is **guaranteed** that the input Sudoku will have **exactly one solution**.

A valid Sudoku solution must satisfy the following rules:
- Each digit **1-9** must appear **exactly once** in each row.
- Each digit **1-9** must appear **exactly once** in each column.
- Each digit **1-9** must appear **exactly once** in each **3x3** sub-grid.

**Note:**  
- `0` represents blank spaces that need to be filled with numbers **1-9**.
- Non-zero cells are **fixed** and cannot be changed.

---

## Examples

### Example 1
**Input:**  

**Explanation:**  
Each row, column, and 3x3 box of the output matrix contains unique numbers.

---

## Constraints
- `mat.size() = 9`
- `mat[i].size() = 9`
- `0 ≤ mat[i][j] ≤ 9`
