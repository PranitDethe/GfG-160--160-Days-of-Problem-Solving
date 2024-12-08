# Overlapping Intervals

Given an array of intervals `arr[][]`, where `arr[i] = [starti, endi]`, the task is to merge all the overlapping intervals.

---

### Examples

#### Example 1
- **Input**: `arr[][] = [[1,3],[2,4],[6,8],[9,10]]`
- **Output**: `[[1,4], [6,8], [9,10]]`
- **Explanation**: The intervals [1,3] and [2,4] overlap, which results in [1,4]. The other intervals do not overlap, so the final merged intervals are [[1,4], [6,8], [9,10]].

#### Example 2
- **Input**: `arr[][] = [[6,8],[1,9],[2,4],[4,7]]`
- **Output**: `[[1,9]]`
- **Explanation**: All intervals overlap with [1,9], so they merge into a single interval [1,9].

---

### Constraints

1. `1 ≤ arr.size() ≤ 10^5`
2. `0 ≤ starti ≤ endi ≤ 10^5`
