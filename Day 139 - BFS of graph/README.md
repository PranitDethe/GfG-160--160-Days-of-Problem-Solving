# BFS of Graph

---

## Problem Statement

Given a connected undirected graph containing `V` vertices, represented by a 2-D adjacency list `adj[][]`, where each `adj[i]` represents the list of vertices connected to vertex `i`, perform a **Breadth First Search (BFS)** traversal starting from vertex `0`. Visit vertices from **left to right** according to the given adjacency list and return a list containing the **BFS traversal** of the graph.

> **Note:** Traverse the graph in the **same order** as they appear in the given adjacency list.

---

## Examples

### Example 1

**Input:**  
`adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]`

**Output:**  
`[0, 2, 3, 1, 4]`

**Explanation:**  
Starting from vertex `0`, the BFS traversal follows these steps:  
- Visit `0` → Output: `[0]`  
- Visit `2` (first neighbor of 0) → `[0, 2]`  
- Visit `3` (next neighbor of 0) → `[0, 2, 3]`  
- Visit `1` (next neighbor of 0) → `[0, 2, 3, 1]`  
- Visit `4` (neighbor of 2) → Final Output: `[0, 2, 3, 1, 4]`

---

### Example 2

**Input:**  
`adj[][] = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]`

**Output:**  
`[0, 1, 2, 3, 4]`

**Explanation:**  
Starting from vertex `0`, the BFS traversal proceeds as follows:  
- Visit `0` → Output: `[0]`  
- Visit `1` → `[0, 1]`  
- Visit `2` → `[0, 1, 2]`  
- Visit `3` (first unvisited neighbor of 2) → `[0, 1, 2, 3]`  
- Visit `4` (next unvisited neighbor of 2) → Final Output: `[0, 1, 2, 3, 4]`

---

## Constraints

- `1 ≤ V = adj.size() ≤ 10^4`  
- `1 ≤ adj[i][j] ≤ 10^4`
