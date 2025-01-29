# Remove Loop in Linked List

## Problem Description
You are given the head of a linked list that **may contain a loop**. A loop means that the last node of the linked list is connected back to a node in the same list.  
The task is to **remove the loop** from the linked list (if it exists).

---

## Custom Input Format
- A head of a singly linked list.
- A position (`pos`) that denotes the **1-based index** of the node to which the last node points.
  - If `pos = 0`, it means the last node points to `null`, indicating **there is no loop**.

---

## Expected Output
- The output will be `true` if:
  - There is **no loop** in the list.
  - The **loop is successfully removed**, and the remaining nodes in the list **remain unchanged**.
- Otherwise, the output will be `false`.

---

## Examples

### Example 1
**Input:**  
`head = [1 -> 3 -> 4], pos = 2`  

**Output:**  
`true`  

**Explanation:**  
A loop is present in the list, and it is successfully removed.

---

### Example 2
**Input:**  
`head = [1 -> 8 -> 3 -> 4], pos = 0`  

**Output:**  
`true`  

**Explanation:**  
There is **no loop** in the linked list.

---

### Example 3
**Input:**  
`head = [1 -> 2 -> 3 -> 4], pos = 1`  

**Output:**  
`true`  

**Explanation:**  
A loop exists in the linked list, and it is successfully removed.

---

## Constraints
- `1 ≤ size of linked list ≤ 10⁵`
