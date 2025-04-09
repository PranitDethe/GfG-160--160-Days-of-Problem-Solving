# Articulation Point - II

---

## Problem Statement

You are given an undirected graph with **V** vertices and **E** edges. The graph is represented as a 2D array `edges[][]`, where each element `edges[i] = [u, v]` indicates an undirected edge between vertices **u** and **v**.

Your task is to return all the **articulation points** (or **cut vertices**) in the graph.

An **articulation point** is a vertex whose removal, along with all its connected edges, **increases the number of connected components** in the graph.

> **Note:** The graph may be disconnected, i.e., it may consist of more than one connected component. If no such point exists, return `{-1}`.

---

## Examples

### Example 1:
**Input:**  
`V = 5`  
`edges[][] = [[0, 1], [1, 4], [4, 3], [4, 2], [2, 3]]`

**Output:**  
`[1, 4]`

**Explanation:**  
Removing vertex `1` or `4` will disconnect the graph as shown below.

### Example 2:
**Input:**  
`V = 4`  
`edges[][] = [[0, 1], [0, 2]]`

**Output:**  
`[0]`

**Explanation:**  
Removing vertex `0` will increase the number of disconnected components to 3.

---

## Constraints
- `1 ≤ V, E ≤ 10^4`

