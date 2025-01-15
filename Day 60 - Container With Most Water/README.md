# Container With Most Water

## Problem Description
Given an array `arr[]` of non-negative integers, where each element `arr[i]` represents the height of vertical lines, determine the maximum amount of water that can be contained between any two lines along with the x-axis.

**Note:** In the case of a single vertical line, it will not be able to hold water.

---

## Examples

### Example 1
**Input:**  
arr[] = [1, 5, 4, 3]  

**Output:**  
6  

**Explanation:**  
The lines with heights 5 and 3 are 2 units apart.  
- Base size = 2  
- Height of container = min(5, 3) = 3  
- Total area to hold water = 3 * 2 = 6.

---

### Example 2
**Input:**  
arr[] = [3, 1, 2, 4, 5]  

**Output:**  
12  

**Explanation:**  
The lines with heights 5 and 3 are 4 units apart.  
- Base size = 4  
- Height of container = min(5, 3) = 3  
- Total area to hold water = 4 * 3 = 12.

---

### Example 3
**Input:**  
arr[] = [2, 1, 8, 6, 4, 6, 5, 5]  

**Output:**  
25  

**Explanation:**  
The lines with heights 8 and 5 are 5 units apart.  
- Base size = 5  
- Height of container = min(8, 5) = 5  
- Total area to hold water = 5 * 5 = 25.

---

## Constraints
- 1 ≤ arr.size() ≤ 10⁵  
- 1 ≤ arr[i] ≤ 10⁴  
