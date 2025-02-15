# Check for BST

## Problem Statement  
Given the **root** of a binary tree. Check whether it is a **Binary Search Tree (BST)** or not.  

**Note:** We are considering that **BSTs cannot contain duplicate nodes**.  

A **BST** is defined as follows:  
1. The **left subtree** of a node contains only nodes with keys **less** than the node's key.  
2. The **right subtree** of a node contains only nodes with keys **greater** than the node's key.  
3. Both the **left** and **right** subtrees must also be binary search trees.  

## Examples  

### Example 1  
**Input:**  
root = [2, 1, 3, N, N, N, 5]

**Output:**  
true


**Explanation:**  
The left subtree of every node contains smaller keys, and the right subtree of every node contains greater keys. Hence, the tree is a **BST**.  

### Example 2  
**Input:**  
root = [2, N, 7, N, 6, N, 9]


**Output:**  
false


**Explanation:**  
Since the node to the **right** of node **7** has a **lesser** key value, it is **not** a valid BST.  

### Example 3  
**Input:**  
root = [10, 5, 20, N, N, 9, 25]


**Output:**  
false


**Explanation:**  
The node with key **9** present in the **right** subtree has a **lesser** key value than the root node, which violates BST properties.  

## Constraints  
- **1 ≤ number of nodes ≤ 10⁵**  
- **1 ≤ node->data ≤ 10⁹**  
