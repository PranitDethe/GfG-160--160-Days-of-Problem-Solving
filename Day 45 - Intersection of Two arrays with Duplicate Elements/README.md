# Intersection of Two Arrays with Duplicate Elements

## Problem Statement
Given two integer arrays `a[]` and `b[]`, find the intersection of the two arrays. The intersection of two arrays consists of elements that are common in both arrays. The result should:
1. Contain unique elements only (no duplicates).
2. Be in any order (the driver code will sort the result in increasing order before printing).

---

## Examples

### Example 1
- **Input**:  
  `a[] = [1, 2, 1, 3, 1]`, `b[] = [3, 1, 3, 4, 1]`
- **Output**:  
  `[1, 3]`
- **Explanation**:  
  1 and 3 are the only common elements, and only one occurrence of each common element is printed.

---

### Example 2
- **Input**:  
  `a[] = [1, 1, 1]`, `b[] = [1, 1, 1, 1, 1]`
- **Output**:  
  `[1]`
- **Explanation**:  
  1 is the only common element in both arrays.

---

### Example 3
- **Input**:  
  `a[] = [1, 2, 3]`, `b[] = [4, 5, 6]`
- **Output**:  
  `[]`
- **Explanation**:  
  There are no common elements in both arrays.

---

## Constraints
- `1 ≤ a.size(), b.size() ≤ 10^5`
- `1 ≤ a[i], b[i] ≤ 10^5`
