# Add Number Linked Lists

## Problem Description
Given the head of two singly linked lists `num1` and `num2`, each representing two non-negative integers, the task is to return the head of a linked list representing the **sum** of these two numbers.

Each linked list represents a number in reverse order, where the **first node** contains the **least significant digit**. The output should not have any leading zeros.

---

## Examples

### Example 1
**Input:**  
num1 = 4 -> 5  
num2 = 3 -> 4 -> 5  

**Output:**  
3 -> 9 -> 0  

**Explanation:**  
The numbers represented by the linked lists are `45` and `345`. Their sum is `390`, represented as `3 -> 9 -> 0`.

---

### Example 2
**Input:**  
num1 = 0 -> 0 -> 6 -> 3  
num2 = 0 -> 7  

**Output:**  
7 -> 0  

**Explanation:**  
The numbers represented by the linked lists are `63` and `7`. Their sum is `70`, represented as `7 -> 0`.

---

## Constraints
- 1 ≤ size of both linked lists ≤ 10⁶  
- 0 ≤ elements of both linked lists ≤ 9
