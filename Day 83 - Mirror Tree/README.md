# Mirror Tree

## Problem Description
Given a **binary tree**, convert the binary tree to its **Mirror Tree**.

The **Mirror** of a Binary Tree `T` is another Binary Tree `M(T)` where the **left** and **right** children of all **non-leaf nodes** are **interchanged**.

---

## Examples

### Example 1
**Input:**  
root[] = [1, 2, 3, N, N, 4]
**Output:**  
[1, 3, 2, N, 4]
**Explanation:**  
![blobid0_1736926809](https://github.com/user-attachments/assets/3f84819c-0431-41c8-9f3e-3855d9b3e8fe)

In the inverted tree, every non-leaf node has its **left** and **right** child interchanged.

---

### Example 2
**Input:**  
root[] = [1, 2, 3, 4, 5]
**Output:**  
[1, 3, 2, N, N, 5, 4]
**Explanation:**  
![blobid1_1736926809](https://github.com/user-attachments/assets/467ad379-6466-4c21-a806-26becf59a4f4)

In the inverted tree, every non-leaf node has its **left** and **right** child interchanged.

---

## Constraints
- `1 ≤ number of nodes ≤ 10^5`
- `1 ≤ node->data ≤ 10^5`
