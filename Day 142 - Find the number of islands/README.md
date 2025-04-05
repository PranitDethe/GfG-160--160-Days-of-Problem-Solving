# Find the Number of Islands

---

## Problem Statement

Given a grid of size `n * m` (`n` is the number of rows and `m` is the number of columns in the grid) consisting of `'W'`s (Water) and `'L'`s (Land), **find the number of islands**.

### Note:
- An **island** is a group of adjacent lands connected **horizontally**, **vertically**, or **diagonally** (i.e., in all 8 directions).
- An island is either **surrounded by water** or lies at the **boundary of the grid**.

---

## Examples

### Example 1

**Input:**
```text
grid[][] = [
  ['L', 'L', 'W', 'W', 'W'],
  ['W', 'L', 'W', 'W', 'L'],
  ['L', 'W', 'W', 'L', 'L'],
  ['W', 'W', 'W', 'W', 'W'],
  ['L', 'W', 'L', 'L', 'W']
]
```

**Output:**  
`4`

**Explanation:**  
There are **4 islands** in the grid.

---

### Example 2

**Input:**
```text
grid[][] = [
  ['W', 'L', 'L', 'L', 'W', 'W', 'W'],
  ['W', 'W', 'L', 'L', 'W', 'L', 'W']
]
```

**Output:**  
`2`

**Explanation:**  
There are **2 islands** in the grid.

---

## Constraints

- `1 ≤ n, m ≤ 500`  
- `grid[i][j] ∈ {'L', 'W'}`

---

