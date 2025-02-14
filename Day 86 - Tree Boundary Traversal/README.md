# Tree Boundary Traversal


## Problem Statement  
Given a **Binary Tree**, find its **Boundary Traversal**. The traversal should be in the following order:

1. **Left Boundary:**  
   - Includes all the nodes on the path from the root to the leftmost leaf node.  
   - Prefer the left child over the right child when traversing.  
   - Do **not** include leaf nodes in this section.

2. **Leaf Nodes:**  
   - All leaf nodes, in **left-to-right order**, that are not part of the left or right boundary.

3. **Reverse Right Boundary:**  
   - Includes all the nodes on the path from the rightmost leaf node to the root, traversed in **reverse order**.  
   - Prefer the right child over the left child when traversing.  
   - Do **not** include the root in this section if it was already included in the left boundary.

**Note:**  
- If the root **doesn't** have a left subtree or right subtree, then the root itself is the left or right boundary.

---

## Examples  

### Example 1  
**Input:**  
root[] = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]

**Output:**  
[1, 2, 4, 8, 9, 6, 7, 3]

---

### Example 2  
**Input:**  
root[] = [1, 2, N, 4, 9, 6, 5, N, 3, N, N, N, N, 7, 8]

**Output:**  
[1, 2, 4, 6, 5, 7, 8]

**Explanation:**  
As the root **doesn't** have a **right subtree**, the right boundary is **not** included in the traversal.

---

### Example 3  
**Input:**  
root[] = [1, N, 2, N, 3, N, 4, N, N]

Tree Structure:  
1
 \
  2
   \
    3
     \
      4

**Output:**  
[1, 4, 3, 2]

**Explanation:**  
- **Left boundary:** `[1]` (as there is no left subtree).  
- **Leaf nodes:** `[4]`.  
- **Right boundary:** `[3, 2]` (in **reverse order**).  
- **Final traversal:** `[1, 4, 3, 2]`.

---

## Constraints  
- **1 ≤ number of nodes ≤ 10⁵**  
- **1 ≤ node->data ≤ 10⁵**  
