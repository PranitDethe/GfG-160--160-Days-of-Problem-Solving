# Move All Zeroes to End

This repository contains a problem statement to move all zeros in an array to the end while maintaining the order of non-zero elements. The operation should be performed **in-place** within the array.

---

## Problem Statement

Given an array `arr[]`, push all zeros in the array to the right end while maintaining the relative order of non-zero elements. The operation should modify the array directly without using extra space.

---

### Examples

#### Example 1
- **Input**: `arr[] = [1, 2, 0, 4, 3, 0, 5, 0]`
- **Output**: `[1, 2, 4, 3, 5, 0, 0, 0]`
- **Explanation**: 
  - There are three zeros, and they are moved to the end while maintaining the order of non-zero elements.

#### Example 2
- **Input**: `arr[] = [10, 20, 30]`
- **Output**: `[10, 20, 30]`
- **Explanation**: 
  - No change is required as there are no zeros in the array.

#### Example 3
- **Input**: `arr[] = [0, 0]`
- **Output**: `[0, 0]`
- **Explanation**: 
  - The array remains unchanged as all elements are zeros.

---

### Constraints

1. `1 ≤ arr.size() ≤ 10^5`
2. `0 ≤ arr[i] ≤ 10^5`
