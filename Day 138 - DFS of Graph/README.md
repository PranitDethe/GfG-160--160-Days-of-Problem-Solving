# DFS of Graph

---

## Problem Statement

Given a connected undirected graph containing `V` vertices represented by a 2-D adjacency list `adj[][]`, where each `adj[i]` represents the list of vertices connected to vertex `i`, perform a **Depth First Search (DFS)** traversal starting from vertex `0`. Visit vertices from **left to right** as per the given adjacency list and return a list containing the **DFS traversal** of the graph.

> **Note:** Do traverse in the **same order** as they are in the given adjacency list.

---

## Examples

### Example 1

**Input:**  
`adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]`  

**Output:**  
`[0, 2, 4, 3, 1]`  

**Explanation:**  
Starting from vertex `0`, the DFS traversal is as follows:  
- Visit `0` → Output: `[0]`  
- Visit `2` (first neighbor of 0) → Output: `[0, 2]`  
- Visit `4` (first neighbor of 2) → Output: `[0, 2, 4]`  
- Backtrack to `2`, then to `0`, and visit `3` → Output: `[0, 2, 4, 3]`  
- Finally, visit `1` → Output: `[0, 2, 4, 3, 1]`

---

### Example 2

**Input:**  
`adj[][] = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]`  

**Output:**  
`[0, 1, 2, 3, 4]`  

**Explanation:**  
Starting from vertex `0`, the DFS traversal is as follows:  
- Visit `0` → Output: `[0]`  
- Visit `1` → Output: `[0, 1]`  
- Visit `2` → Output: `[0, 1, 2]`  
- Visit `3` → Output: `[0, 1, 2, 3]`  
- Backtrack to `2` and visit `4` → Output: `[0, 1, 2, 3, 4]`

---

## Constraints

- `1 ≤ V = adj.size() ≤ 10^4`  
- `1 ≤ adj[i][j] ≤ 10^4`  

