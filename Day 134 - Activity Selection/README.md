# Activity Selection Problem

## Problem Statement
You are given a set of activities, each with a start time and a finish time, represented by the arrays `start[]` and `finish[]`, respectively. A single person can perform only one activity at a time, meaning no two activities can overlap. Your task is to determine the maximum number of activities that a person can complete in a day.

---

## Examples

### Example 1:
**Input:**  
```plaintext
start[] = [1, 3, 0, 5, 8, 5]
finish[] = [2, 4, 6, 7, 9, 9]
```
**Output:**  
```plaintext
4
```
**Explanation:**  
A person can perform at most four activities. The maximum set of activities that can be executed is `{0, 1, 3, 4}`.

---

### Example 2:
**Input:**  
```plaintext
start[] = [10, 12, 20]
finish[] = [20, 25, 30]
```
**Output:**  
```plaintext
1
```
**Explanation:**  
A person can perform at most one activity.

---

### Example 3:
**Input:**  
```plaintext
start[] = [1, 3, 2, 5]
finish[] = [2, 4, 3, 6]
```
**Output:**  
```plaintext
3
```
**Explanation:**  
A person can perform activities `{0, 1, 3}`.

---

## Constraints
- `1 ≤ start.size() = finish.size() ≤ 2*10^5`
- `1 ≤ start[i] ≤ finish[i] ≤ 10^9`

