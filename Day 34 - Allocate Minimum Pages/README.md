# Allocate Minimum Pages

## Problem Statement

You are given an array `arr[]` of integers, where each element `arr[i]` represents the number of pages in the i-th book. Additionally, you are given an integer `k`, which represents the number of students. The task is to allocate books to students such that:

1. Each student receives **at least one book**.
2. Each student is assigned a **contiguous sequence of books**.
3. No book is assigned to more than one student.

The objective is to minimize the **maximum number of pages assigned to any student**. In other words, find an arrangement where the student with the largest allocation has the smallest possible maximum.

### Note:
- Return `-1` if it is not possible to allocate books as per the conditions.
- The allocation should be done in a contiguous order.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = [12, 34, 67, 90], k = 2`
- **Output**:  
  `113`
- **Explanation**:  
  Allocation can be done as follows:
  - `[12]` and `[34, 67, 90]` → Maximum Pages = 191  
  - `[12, 34]` and `[67, 90]` → Maximum Pages = 157  
  - `[12, 34, 67]` and `[90]` → Maximum Pages = 113  
  Therefore, the minimum of these cases is **113**, which is the output.

### Example 2
- **Input**:  
  `arr[] = [15, 17, 20], k = 5`
- **Output**:  
  `-1`
- **Explanation**:  
  Allocation is not possible as there are more students than books.

### Example 3
- **Input**:  
  `arr[] = [22, 23, 67], k = 1`
- **Output**:  
  `112`
- **Explanation**:  
  All books must be allocated to one student. The total pages = `22 + 23 + 67 = 112`.

---

## Constraints
1. `1 <= arr.size() <= 10^6`
2. `1 <= arr[i] <= 10^3`
3. `1 <= k <= 10^3`
