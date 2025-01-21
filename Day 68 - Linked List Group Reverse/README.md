# Linked List Group Reverse

## Problem Description
Given the head of a linked list, the task is to reverse every **k nodes** in the linked list. If the number of nodes in the linked list is not a multiple of `k`, the remaining nodes at the end should also be reversed as a group.

---

## Examples

### Example 1
**Input:**  
head = 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8  
k = 4  

**Output:**  
4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5  

**Explanation:**  
The first 4 elements `1, 2, 2, 4` are reversed, followed by reversing the next 4 elements `5, 6, 7, 8`. Hence, the resultant linked list is `4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5`.

---

### Example 2
**Input:**  
head = 1 -> 2 -> 3 -> 4 -> 5  
k = 3  

**Output:**  
3 -> 2 -> 1 -> 5 -> 4  

**Explanation:**  
The first 3 elements `1, 2, 3` are reversed, and the remaining 2 elements `4, 5` are also reversed. Hence, the resultant linked list is `3 -> 2 -> 1 -> 5 -> 4`.

---

## Constraints
- 1 ≤ size of linked list ≤ 10⁵  
- 1 ≤ data of nodes ≤ 10⁶  
- 1 ≤ k ≤ size of linked list  
