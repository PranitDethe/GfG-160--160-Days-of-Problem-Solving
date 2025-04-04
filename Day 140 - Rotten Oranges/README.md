# Rotten Oranges

---

## Problem Statement

Given a matrix `mat[][]` of dimension `n x m` where each cell in the matrix can have one of the following values:

- `0` : Empty cell  
- `1` : Cell with fresh oranges  
- `2` : Cell with rotten oranges  

We need to determine the **earliest time** after which **all the oranges become rotten**. A rotten orange at index `(i, j)` can rot other fresh oranges at indexes `(i-1, j)`, `(i+1, j)`, `(i, j-1)`, `(i, j+1)` — that is, in **up, down, left, and right** directions in **unit time**.

> **Note:**  
Return the **minimum time** required to rot all the fresh oranges.  
If it is **not possible** to rot all the oranges, return **-1**.

---

## Examples

### Example 1

**Input:**  
`mat[][] = [[0, 1, 2], [0, 1, 2], [2, 1, 1]]`

**Output:**  
`1`

**Explanation:**  
Oranges at positions `(0,2)`, `(1,2)`, and `(2,0)` will rot oranges at `(0,1)`, `(1,1)`, `(2,2)`, and `(2,1)` in **1 unit time**.

---

### Example 2

**Input:**  
`mat[][] = [[2, 2, 0, 1]]`

**Output:**  
`-1`

**Explanation:**  
Oranges at `(0,0)` and `(0,1)` cannot reach the orange at `(0,3)` to rot it. So it's **impossible**.

---

### Example 3

**Input:**  
`mat[][] = [[2, 2, 2], [0, 2, 0]]`

**Output:**  
`0`

**Explanation:**  
There are **no fresh oranges**, so the answer is `0`.

---

## Constraints

- `1 ≤ mat.size() ≤ 500`  
- `1 ≤ mat[0].size() ≤ 500`  
- `mat[i][j] ∈ {0, 1, 2}`
