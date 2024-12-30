# Union of Arrays with Duplicates

## Problem Statement
Given two arrays `a[]` and `b[]`, find the number of elements in the union of these two arrays.  
The **Union** of two arrays is defined as the set containing all distinct elements from both arrays. If an element appears multiple times, it is included only once in the union.

---

## Examples

### Example 1
- **Input**:  
  `a[] = [1, 2, 3, 4, 5]`, `b[] = [1, 2, 3]`
- **Output**:  
  `5`
- **Explanation**:  
  The union of both arrays is `{1, 2, 3, 4, 5}`. The count of elements is `5`.

---

### Example 2
- **Input**:  
  `a[] = [85, 25, 1, 32, 54, 6]`, `b[] = [85, 2]`
- **Output**:  
  `7`
- **Explanation**:  
  The union of both arrays is `{85, 25, 1, 32, 54, 6, 2}`. The count of elements is `7`.

---

### Example 3
- **Input**:  
  `a[] = [1, 2, 1, 1, 2]`, `b[] = [2, 2, 1, 2, 1]`
- **Output**:  
  `2`
- **Explanation**:  
  The union of both arrays is `{1, 2}`. The count of elements is `2`.

---

## Constraints
- `1 ≤ a.size(), b.size() ≤ 10^6`
- `0 ≤ a[i], b[i] ≤ 10^5`
