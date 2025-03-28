# Peak Element

## Problem Statement

Given an array `arr[]` where no two adjacent elements are the same, find the index of a **peak element**. An element is considered a peak if it is greater than its adjacent elements (if they exist).  

If there are multiple peak elements, return the index of any one of them. The output will be `"true"` if the index returned by your function is correct; otherwise, it will be `"false"`.

**Note**: Consider the element before the first element and the element after the last element to be negative infinity.

---

## Examples

### Example 1
- **Input**:  
  `arr = [1, 2, 4, 5, 7, 8, 3]`
- **Output**:  
  `true`
- **Explanation**:  
  `arr[5] = 8` is a peak element because `arr[4] < arr[5] > arr[6]`.

### Example 2
- **Input**:  
  `arr = [10, 20, 15, 2, 23, 90, 80]`
- **Output**:  
  `true`
- **Explanation**:  
  `arr[1] = 20` and `arr[5] = 90` are peak elements because:  
  - `arr[0] < arr[1] > arr[2]`  
  - `arr[4] < arr[5] > arr[6]`.

### Example 3
- **Input**:  
  `arr = [1, 2, 3]`
- **Output**:  
  `true`
- **Explanation**:  
  `arr[2]` is a peak element because `arr[1] < arr[2]` and `arr[2]` is the last element, so it has negative infinity to its right.

---

## Constraints
1. `1 ≤ arr.size() ≤ 10^6`
2. `-2^31 ≤ arr[i] ≤ 2^31 - 1`
