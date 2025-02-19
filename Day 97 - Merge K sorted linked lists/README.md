# Merge K Sorted Linked Lists


## Problem Statement
Given an array `arr[]` of `n` sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list, then return the head of the merged linked list.

## Examples

### Example 1
**Input:**  
arr[] = [1 -> 2 -> 3, 4 -> 5, 5 -> 6, 7 -> 8]  

**Output:**  
1 -> 2 -> 3 -> 4 -> 5 -> 5 -> 6 -> 7 -> 8  

**Explanation:**  
The `arr[]` has 4 sorted linked lists of sizes 3, 2, 2, and 2.  
1st list: `1 -> 2 -> 3`  
2nd list: `4 -> 5`  
3rd list: `5 -> 6`  
4th list: `7 -> 8`  
The merged list will be: `1 -> 2 -> 3 -> 4 -> 5 -> 5 -> 6 -> 7 -> 8`  

### Example 2
**Input:**  
arr[] = [1 -> 3, 8, 4 -> 5 -> 6]  

**Output:**  
1 -> 3 -> 4 -> 5 -> 6 -> 8  

**Explanation:**  
The `arr[]` has 3 sorted linked lists of sizes 2, 1, and 3.  
1st list: `1 -> 3`  
2nd list: `8`  
3rd list: `4 -> 5 -> 6`  
The merged list will be: `1 -> 3 -> 4 -> 5 -> 6 -> 8`  

## Constraints
- `1 <= total number of nodes <= 10^5`  
- `1 <= node->data <= 10^3`
