# Count Inversions

Given an array of integers `arr[]`. Find the Inversion Count in the array.  
Two elements `arr[i]` and `arr[j]` form an inversion if `arr[i] > arr[j]` and `i < j`.

**Inversion Count**: For an array, inversion count indicates how far (or close) the array is from being sorted. 
- If the array is already sorted, the inversion count is `0`.
- If an array is sorted in reverse order, the inversion count is maximum.

---

### Examples

#### Example 1
- **Input**: `arr[] = [2, 4, 1, 3, 5]`
- **Output**: `3`
- **Explanation**: The sequence `[2, 4, 1, 3, 5]` has three inversions: `(2, 1)`, `(4, 1)`, and `(4, 3)`.

#### Example 2
- **Input**: `arr[] = [2, 3, 4, 5, 6]`
- **Output**: `0`
- **Explanation**: The sequence is already sorted, so there is no inversion count.

#### Example 3
- **Input**: `arr[] = [10, 10, 10]`
- **Output**: `0`
- **Explanation**: As all the elements of the array are the same, there is no inversion count.

---

### Constraints

1. `1 ≤ arr.size() ≤ 10^5`
2. `1 ≤ arr[i] ≤ 10^4`
