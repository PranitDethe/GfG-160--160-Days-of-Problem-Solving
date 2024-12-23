# Non-overlapping Intervals

Given a 2D array `intervals[][]` representing intervals where `intervals[i] = [starti, endi]`, the task is to return the **minimum number of intervals** you need to remove to make the rest of the intervals non-overlapping.

---

### Examples

#### Example 1
- **Input**: `intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]`
- **Output**: `1`
- **Explanation**: Removing `[1, 3]` makes the rest of the intervals non-overlapping.

#### Example 2
- **Input**: `intervals[][] = [[1, 3], [1, 3], [1, 3]]`
- **Output**: `2`
- **Explanation**: You need to remove two `[1, 3]` intervals to make the rest non-overlapping.

#### Example 3
- **Input**: `intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]`
- **Output**: `0`
- **Explanation**: All intervals are already non-overlapping.

---

### Constraints
1. `1 ≤ intervals.size() ≤ 10^5`
2. `|intervalsi| == 2`
3. `0 ≤ starti < endi ≤ 5 * 10^4`
