# Merge Two Sorted Linked Lists

## Problem Description
Given the heads of two **sorted linked lists**, the task is to merge both lists into a **single sorted linked list** and return the head of the merged list.

---

## Examples

### Example 1
**Input:**  
head1 = 5 -> 10 -> 15 -> 40  
head2 = 2 -> 3 -> 20  

**Output:**  
2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40  

**Explanation:**  
Both linked lists are merged in sorted order.

---

### Example 2
**Input:**  
head1 = 1 -> 1  
head2 = 2 -> 4  

**Output:**  
1 -> 1 -> 2 -> 4  

**Explanation:**  
Both linked lists are merged in sorted order.

---

## Constraints
- 1 ≤ number of nodes ≤ 10³  
- 0 ≤ node->data ≤ 10⁵  
