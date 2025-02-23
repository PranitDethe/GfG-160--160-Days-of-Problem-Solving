# Next Greater Element


## Problem Statement
Given an array `arr[]` of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. The next greater element of an element in the array is the nearest element on the right that is greater than the current element.

If there does not exist a next greater element for the current element, then the next greater element for the current element is `-1`. For example, the next greater element of the last element is always `-1`.

## Examples

### Example 1:
**Input:**  
`arr[] = [1, 3, 2, 4]`

**Output:**  
`[3, 4, 4, -1]`

**Explanation:**  
The next greater element for:
- `1` is `3`
- `3` is `4`
- `2` is `4`
- `4` has no greater element, so `-1`

---

### Example 2:
**Input:**  
`arr[] = [6, 8, 0, 1, 3]`

**Output:**  
`[8, -1, 1, 3, -1]`

**Explanation:**  
The next greater element for:
- `6` is `8`
- `8` has no greater element, so `-1`
- `0` is `1`
- `1` is `3`
- `3` has no greater element, so `-1`

---

### Example 3:
**Input:**  
`arr[] = [10, 20, 30, 50]`

**Output:**  
`[20, 30, 50, -1]`

**Explanation:**  
For a sorted array, the next element is the next greater element except for the last element.

---

### Example 4:
**Input:**  
`arr[] = [50, 40, 30, 10]`

**Output:**  
`[-1, -1, -1, -1]`

**Explanation:**  
There is no greater element for any of the elements in the array, so all are `-1`.

---

## Constraints:
- `1 ≤ arr.size() ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^9`

