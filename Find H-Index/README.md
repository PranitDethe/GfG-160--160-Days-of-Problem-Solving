# Find H-Index

Given an integer array `citations[]`, where `citations[i]` is the number of citations a researcher received for the `i`th paper, the task is to find the **H-index**.

**H-Index** is the largest value such that the researcher has at least `H` papers that have been cited at least `H` times.

---

### Examples

#### Example 1
- **Input**: `citations[] = [3, 0, 5, 3, 0]`
- **Output**: `3`
- **Explanation**: There are at least 3 papers (with citation counts of 3, 5, and 3) with at least 3 citations each.

#### Example 2
- **Input**: `citations[] = [5, 1, 2, 4, 1]`
- **Output**: `2`
- **Explanation**: There are 3 papers (with citation counts of 5, 2, and 4) that have 2 or more citations. However, the H-index cannot be 3 because there aren't 3 papers with 3 or more citations.

#### Example 3
- **Input**: `citations[] = [0, 0]`
- **Output**: `0`
- **Explanation**: No papers have any citations, so the H-index is 0.

---

### Constraints

1. `1 ≤ citations.size() ≤ 10^6`
2. `0 ≤ citations[i] ≤ 10^6`
