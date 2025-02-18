# Serialize and Deserialize a Binary Tree

## Problem Statement  
Serialization is the process of storing a binary tree into an array so that it can be later restored. **Deserialization** is the process of reading the tree back from the array.  

You need to implement the following functions:

- `serialize()`: Stores the tree into an array `a` and returns the array.
- `deSerialize()`: Deserializes the array to reconstruct the tree and returns the root of the tree.

### **Note**:  
- Multiple nodes **can have the same data**.  
- Node values are **always positive integers**.  
- Your solution will be correct if the tree returned by **`deSerialize(serialize(input_tree))`** is the same as the input tree.  
- The driver code will print the **in-order traversal** of the tree returned by `deSerialize(serialize(input_tree))`.  

## **Examples**  

### **Example 1**  
**Input:**  
root = [1, 2, 3]


**Output:**  
[2, 1, 3]


---

### **Example 2**  
**Input:**  
root = [10, 20, 30, 40, 60, N, N]


**Output:**  
[40, 20, 60, 10, 30]

---

## **Constraints**  
- **1 ≤ Number of nodes ≤ 10⁴**  
- **1 ≤ Data of a node ≤ 10⁹**  
