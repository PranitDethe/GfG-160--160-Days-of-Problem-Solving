# Directed Graph Cycle

---

## Problem Statement

Given a **Directed Graph** with `V` vertices (Numbered from `0` to `V-1`) and `E` edges, check whether it contains any **cycle** or not.

The graph is represented as a 2D vector `edges[][]`, where each entry `edges[i] = [u, v]` denotes an edge from vertex `u` to vertex `v`.

---

## Examples

### Example 1:
**Input:**
```
V = 4  
edges[][] = [[0, 1], [1, 2], [2, 3], [3, 3]]
```
**Output:**
```
true
```
**Explanation:**
There is a self-loop at vertex 3, i.e., `3 -> 3`, which forms a cycle.

---

### Example 2:
**Input:**
```
V = 3  
edges[][] = [[0, 1], [1, 2]]
```
**Output:**
```
false
```
**Explanation:**
There is no cycle in the graph.

---

## Constraints
- `1 ≤ V, E ≤ 10^5`

---

## Note
Detecting cycles in a **Directed Graph** is a common graph theory problem. Depth First Search (DFS) is typically used for this, leveraging a recursion stack to detect cycles effectively.

---

