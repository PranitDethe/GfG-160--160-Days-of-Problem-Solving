# Count the Number of Possible Triangles

## Problem Description
Given an integer array `arr[]`, find the number of triangles that can be formed with three different array elements as lengths of three sides of a triangle.  

A triangle with three given sides is only possible if the sum of any two sides is always greater than the third side.

---

## Examples

### Example 1
**Input:**  
arr[] = [4, 6, 3, 7]  
**Output:**  
3  
**Explanation:**  
There are three triangles possible:  
- [3, 4, 6]  
- [4, 6, 7]  
- [3, 6, 7]  
Note that [3, 4, 7] is not a possible triangle.

---

### Example 2
**Input:**  
arr[] = [10, 21, 22, 100, 101, 200, 300]  
**Output:**  
6  
**Explanation:**  
The 6 possible triangles are:  
- [10, 21, 22]  
- [21, 100, 101]  
- [22, 100, 101]  
- [10, 100, 101]  
- [100, 101, 200]  
- [101, 200, 300]  

---

### Example 3
**Input:**  
arr[] = [1, 2, 3]  
**Output:**  
0  
**Explanation:**  
No triangles are possible.

---

## Constraints
- 3 <= arr.size() <= 10^3  
- 0 <= arr[i] <= 10^5
