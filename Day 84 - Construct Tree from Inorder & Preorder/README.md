# Construct Tree from Inorder & Preorder

## Problem Description
Given two arrays representing the **inorder** and **preorder** traversals of a **binary tree**, construct the tree and return the **root node** of the constructed tree.

**Note:** The output is written in **postorder traversal**.

---

## Examples

### Example 1
**Input:**  
inorder[] = [1, 6, 8, 7] preorder[] = [1, 6, 7, 8]

**Output:**  
[8, 7, 6, 1]

**Explanation:**  
The tree will look like:
![blobid0_1738646717](https://github.com/user-attachments/assets/9fd8284a-cc53-4899-acf7-4567341952d7)

---

### Example 2
**Input:**  
inorder[] = [3, 1, 4, 0, 2, 5] preorder[] = [0, 1, 3, 4, 2, 5]

**Output:**  
[3, 4, 1, 5, 2, 0]

**Explanation:**  
The tree will look like:
![blobid1_1738646749](https://github.com/user-attachments/assets/4848bd27-5700-48ca-a2cb-3b8571127b55)


---

### Example 3
**Input:**  
inorder[] = [2, 5, 4, 1, 3] preorder[] = [1, 4, 5, 2, 3]

**Output:**  
[2, 5, 4, 3, 1]


**Explanation:**  
The tree will look like:

![blobid2_1738647091](https://github.com/user-attachments/assets/504af5e3-c87d-4ee2-8cbb-c922ab41d498)


---

## Constraints
- **1 ≤** number of nodes **≤ 10³**
- **0 ≤** nodes->data **≤ 10³**
- Both the **inorder** and **preorder** arrays contain **unique values**.
