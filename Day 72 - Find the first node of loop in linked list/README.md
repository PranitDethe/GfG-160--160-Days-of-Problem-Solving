# Find the First Node of Loop in Linked List

## Problem Description
You are given the head of a singly linked list. If a loop exists in the list, return the **first node** of the loop. Otherwise, return `NULL`.

### Custom Input Format
- A head of a singly linked list.
- A position (`pos`) that denotes the **1-based index** of the node to which the last node points.  
  - If `pos = 0`, it means the last node points to `null`, indicating there is no loop.

---

## Examples

### Example 1
**Input:**  
`head = [1 -> 2 -> 3 -> 4 -> 5], pos = 3`  

**Output:**  
`3`  

**Explanation:**  
A loop exists in the linked list, and the first node of the loop is `3`.

---

### Example 2
**Input:**  
`head = [1 -> 2 -> 3 -> 4 -> 5], pos = 0`  

**Output:**  
`-1`  

**Explanation:**  
No loop exists in the given linked list. Hence, the output is `-1`.

---

## Constraints
- `1 ≤ number of nodes ≤ 10⁶`  
- `1 ≤ node->data ≤ 10⁶`
