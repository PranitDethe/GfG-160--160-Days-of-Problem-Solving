# Diameter of a Binary Tree

## Problem Description
Given a **binary tree**, the **diameter** (also known as the **width**) is defined as the **number of edges** on the **longest path** between two **leaf nodes** in the tree.  
This path **may or may not** pass through the root.

Your task is to **find the diameter** of the tree.

---

## Examples

### Example 1
**Input:**  
root[] = [1, 2, 3]

![download](https://github.com/user-attachments/assets/cfa626e7-d691-49aa-ac90-316ad75d4ab7)

**Output:**  2
**Explanation:**  
The longest path has **2 edges** (`node 2 -> node 1 -> node 3`).

![download](https://github.com/user-attachments/assets/eb5e2831-a7f8-4758-b47b-edf9236365e6)

---

### Example 2
**Input:**  
root[] = [5, 8, 6, 3, 7, 9]

![download](https://github.com/user-attachments/assets/d404b629-a82b-43c4-a4c7-006d874a2e79)

**Output:**  4
**Explanation:**  
The longest path has **4 edges** (`node 3 -> node 8 -> node 5 -> node 6 -> node 9`).

![download](https://github.com/user-attachments/assets/883a2cb7-6882-4ebb-925a-9ea1767c9e22)

---

## Constraints
- `1 ≤ number of nodes ≤ 10^5`
- `0 ≤ node->data ≤ 10^5`



