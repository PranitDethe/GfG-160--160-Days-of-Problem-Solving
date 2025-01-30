# N-Queen Problem

## Problem Description
The **N-Queens Puzzle** is the problem of placing `n` queens on an `n × n` chessboard such that no two queens can attack each other. Two queens attack each other if they are placed:
- On the same row
- On the same column
- On the same diagonal

Given an integer `n`, find all distinct solutions to the N-Queens puzzle.  
Each solution should represent a distinct board configuration of queen placements, where solutions are represented as permutations of `[1, 2, 3, ..., n]`.  
In this representation, the number in the `ith` position denotes the row in which the queen is placed in the `ith` column.

---

## Examples

### Example 1
**Input:**  
`n = 1`  

**Output:**  
`[1]`  

**Explanation:**  
Only one queen can be placed in the single cell available.

---

### Example 2
**Input:**  
`n = 4`  

**Output:**  
`[[2, 4, 1, 3], [3, 1, 4, 2]]`  

**Explanation:**  
There are **2** possible solutions for `n = 4`.

---

### Example 3
**Input:**  
`n = 2`  

**Output:**  
`[]`  

**Explanation:**  
There are no possible solutions for `n = 2`.

---

## Constraints
- `1 ≤ n ≤ 10`
