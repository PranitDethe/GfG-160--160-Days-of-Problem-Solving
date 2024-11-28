# Second Largest Element Finder

This repository contains a problem statement to find the **second largest element** in an array of positive integers. If the second largest element doesn't exist (e.g., all elements are the same), the output should be `-1`.

---

## Problem Statement

Given an array of positive integers `arr[]`, return the second largest element from the array. The second largest element must not be equal to the largest element.

---

### Examples

#### Example 1
- **Input**: `arr[] = [12, 35, 1, 10, 34, 1]`
- **Output**: `34`
- **Explanation**: 
  - The largest element is `35`.
  - The second largest element is `34`.

#### Example 2
- **Input**: `arr[] = [10, 5, 10]`
- **Output**: `5`
- **Explanation**: 
  - The largest element is `10`.
  - The second largest element is `5`.

#### Example 3
- **Input**: `arr[] = [10, 10, 10]`
- **Output**: `-1`
- **Explanation**: 
  - All elements are equal, so no second largest element exists.

---

### Constraints

1. `2 ≤ arr.size() ≤ 10^5`
2. `1 ≤ arr[i] ≤ 10^5`

---
