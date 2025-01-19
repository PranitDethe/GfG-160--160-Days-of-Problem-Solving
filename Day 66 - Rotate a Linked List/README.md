# Rotate a Linked List

## Problem Description
Given the head of a singly linked list, your task is to **left rotate** the linked list **k** times.

---

## Examples

### Example 1
**Input:**  
head = 10 -> 20 -> 30 -> 40 -> 50, k = 4  

**Output:**  
50 -> 10 -> 20 -> 30 -> 40  

**Explanation:**  
- Rotate 1: 20 -> 30 -> 40 -> 50 -> 10  
- Rotate 2: 30 -> 40 -> 50 -> 10 -> 20  
- Rotate 3: 40 -> 50 -> 10 -> 20 -> 30  
- Rotate 4: 50 -> 10 -> 20 -> 30 -> 40  

---

### Example 2
**Input:**  
head = 10 -> 20 -> 30 -> 40, k = 6  

**Output:**  
30 -> 40 -> 10 -> 20  

**Explanation:**  
Since k = 6, it is equivalent to k = 6 % 4 = 2 (as the list size is 4).  
- Rotate 1: 20 -> 30 -> 40 -> 10  
- Rotate 2: 30 -> 40 -> 10 -> 20  

---

## Constraints
- 1 ≤ number of nodes ≤ 10⁵  
- 0 ≤ k ≤ 10⁹  
- 0 ≤ data of node ≤ 10⁹  
