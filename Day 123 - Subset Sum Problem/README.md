# Subset Sum Problem

## Problem Statement
Given an array of positive integers `arr[]` and a value `sum`, determine if there is a subset of `arr[]` with sum equal to the given `sum`.

## Examples

### Example 1
**Input:**  
```plaintext
arr[] = [3, 34, 4, 12, 5, 2], sum = 9
```
**Output:**  
```plaintext
true
```
**Explanation:**  
Here there exists a subset with target sum = 9: `{4, 3, 2}`.

### Example 2
**Input:**  
```plaintext
arr[] = [3, 34, 4, 12, 5, 2], sum = 30
```
**Output:**  
```plaintext
false
```
**Explanation:**  
There is no subset with target sum 30.

### Example 3
**Input:**  
```plaintext
arr[] = [1, 2, 3], sum = 6
```
**Output:**  
```plaintext
true
```
**Explanation:**  
The entire array can be taken as a subset, giving `1 + 2 + 3 = 6`.

## Constraints
- `1 <= arr.size() <= 200`
- `1 <= arr[i] <= 200`
- `1 <= sum <= 10^4`

