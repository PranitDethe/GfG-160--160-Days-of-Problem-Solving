# Trapping Rain Water

## Problem Description
Given an array `arr[]` consisting of non-negative integers representing the heights of blocks, compute the total amount of water that can be trapped between the blocks during the rainy season. Each block has a width of 1.

---

## Examples

### Example 1
**Input:**  
arr[] = [3, 0, 1, 0, 4, 0, 2]  

**Output:**  
10  

**Explanation:**  
Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

---

### Example 2
**Input:**  
arr[] = [3, 0, 2, 0, 4]  

**Output:**  
7  

**Explanation:**  
Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.

---

### Example 3
**Input:**  
arr[] = [1, 2, 3, 4]  

**Output:**  
0  

**Explanation:**  
No water can be trapped as there are no bounds on both sides.

---

### Example 4
**Input:**  
arr[] = [2, 1, 5, 3, 1, 0, 4]  

**Output:**  
9  

**Explanation:**  
Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.

---

## Constraints
- 1 < arr.size() < 10⁵  
- 0 < arr[i] < 10³  
