# Undirected Graph Cycle

---

## Problem Statement

Given an **undirected graph** with `V` vertices and `E` edges, represented as a 2D vector `edges[][]`, where each entry `edges[i] = [u, v]` denotes an edge between vertices `u` and `v`, determine whether the **graph contains a cycle** or not.

---

## Examples

### Example 1

**Input:**  
`V = 4`, `E = 4`,  
`edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]`

**Output:**  
`true`

**Explanation:**  
The cycle `1 -> 2 -> 0 -> 1` exists in the graph.

---

### Example 2

**Input:**  
`V = 4`, `E = 3`,  
`edges[][] = [[0, 1], [1, 2], [2, 3]]`

**Output:**  
`false`

**Explanation:**  
No cycle is present in the graph.

---

## Constraints

- `1 ≤ V ≤ 10^5`  
- `1 ≤ E = edges.size() ≤ 10^5`

---
