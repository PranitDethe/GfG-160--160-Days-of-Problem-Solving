# Dijkstra Algorithm


## Problem Statement

Given an undirected, weighted graph with **V** vertices numbered from **0** to **V-1** and **E** edges, represented by a 2D array `edges[][]`, where `edges[i] = [u, v, w]` represents the edge between the nodes **u** and **v** having **w** edge weight.

You have to find the shortest distance of all the vertices from the source vertex `src`, and return an array of integers where the `ith` element denotes the shortest distance between `ith` node and source vertex `src`.

> **Note:** The graph is connected and doesn't contain any negative weight edge.

---

## Examples

### Example 1:

**Input:**  
V = 3  
edges[][] = [[0, 1, 1], [1, 2, 3], [0, 2, 6]]  
src = 2  

**Output:**  
[4, 3, 0]

**Explanation:**  
Shortest Paths:
- For 2 to 0 minimum distance will be 4. Path: 2 -> 1 -> 0
- For 2 to 1 minimum distance will be 3. Path: 2 -> 1
- For 2 to 2 minimum distance will be 0. Path: 2 -> 2

---

### Example 2:

**Input:**  
V = 5  
edges[][] = [[0, 1, 4], [0, 2, 8], [1, 4, 6], [2, 3, 2], [3, 4, 10]]  
src = 0

**Output:**  
[0, 4, 8, 10, 10]

**Explanation:**  
Shortest Paths:
- For 0 to 1 minimum distance will be 4. Path: 0 -> 1
- For 0 to 2 minimum distance will be 8. Path: 0 -> 2
- For 0 to 3 minimum distance will be 10. Path: 0 -> 2 -> 3
- For 0 to 4 minimum distance will be 10. Path: 0 -> 1 -> 4

---

## Constraints

- 1 ≤ V ≤ 10⁵  
- 1 ≤ E = edges.size() ≤ 10⁵  
- 0 ≤ edges[i][j] ≤ 10⁴  
- 0 ≤ src < V

