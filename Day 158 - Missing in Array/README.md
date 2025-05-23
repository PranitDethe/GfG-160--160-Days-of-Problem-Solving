# Missing in Array

## Problem Statement

You are given an array `arr[]` of size `n - 1` that contains distinct integers in the range from `1` to `n` (inclusive). This array represents a permutation of the integers from `1` to `n` with one element missing. Your task is to identify and return the missing element.

---

## Examples

**Input:**
```text
arr[] = [1, 2, 3, 5]
```
**Output:**
```text
4
```
**Explanation:**
All the numbers from 1 to 5 are present except 4.

---

**Input:**
```text
arr[] = [8, 2, 4, 5, 3, 7, 1]
```
**Output:**
```text
6
```
**Explanation:**
All the numbers from 1 to 8 are present except 6.

---

**Input:**
```text
arr[] = [1]
```
**Output:**
```text
2
```
**Explanation:**
Only 1 is present so the missing element is 2.

---

## Constraints

- 1 \u2264 arr.size() \u2264 10^6  
- 1 \u2264 arr[i] \u2264 arr.size() + 1

