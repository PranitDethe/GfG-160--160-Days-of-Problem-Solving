# Insert Interval

Geek has an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the ith event. The array `intervals` is sorted in ascending order by `starti`. 

The task is to add a new interval `newInterval = [newStart, newEnd]` into `intervals` such that:
1. The resulting array is still sorted in ascending order by `starti`.
2. There are no overlapping intervals (merge overlapping intervals if necessary).

---

### Examples

#### Example 1
- **Input**: 
  - `intervals = [[1,3], [4,5], [6,7], [8,10]]`
  - `newInterval = [5,6]`
- **Output**: `[[1,3], [4,7], [8,10]]`
- **Explanation**: The new interval `[5,6]` overlaps with `[4,5]` and `[6,7]`, merging them into `[4,7]`.

#### Example 2
- **Input**: 
  - `intervals = [[1,2], [3,5], [6,7], [8,10], [12,16]]`
  - `newInterval = [4,9]`
- **Output**: `[[1,2], [3,10], [12,16]]`
- **Explanation**: The new interval `[4,9]` overlaps with `[3,5]`, `[6,7]`, and `[8,10]`, merging them into `[3,10]`.

---

### Constraints
1. `1 ≤ intervals.size() ≤ 10^5`
2. `0 ≤ start[i], end[i] ≤ 10^9`
