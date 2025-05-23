# Maximum of Minimum for Every Window Size
 

## Problem Statement
Given an array of integers `arr[]`, the task is to find the maximum of the minimum values for every possible window size in the array, where the window size ranges from `1` to `arr.size()`.

More formally, for each window size `k`, determine the smallest element in all windows of size `k`, and then find the largest value among these minimums where `1 <= k <= arr.size()`.

## Examples

### Example 1
**Input:**  
```
arr[] = [10, 20, 30, 50, 10, 70, 30]
```
**Output:**  
```
[70, 30, 20, 10, 10, 10, 10]
```
**Explanation:**  
1. First element in output indicates maximum of minimums of all windows of size `1`. Minimums of windows of size `1` are `[10], [20], [30], [50], [10], [70], [30]`. Maximum of these minimums is `70`.
2. Second element in output indicates maximum of minimums of all windows of size `2`. Minimums of windows of size `2` are `[10], [20], [30], [10], [10], [30]`. Maximum of these minimums is `30`.
3. Third element in output indicates maximum of minimums of all windows of size `3`. Minimums of windows of size `3` are `[10], [20], [10], [10], [10]`. Maximum of these minimums is `20`.
4. Similarly, other elements of the output are computed.

### Example 2
**Input:**  
```
arr[] = [10, 20, 30]
```
**Output:**  
```
[30, 20, 10]
```
**Explanation:**  
1. First element in output indicates maximum of minimums of all windows of size `1`. Minimums of windows of size `1` are `[10] , [20] , [30]`. Maximum of these minimums is `30`.
2. Second element in output indicates maximum of minimums of all windows of size `2`. Minimums of windows of size `2` are `[10], [20]`. Maximum of these minimums is `20`.
3. Third element in output indicates maximum of minimums of all windows of size `3`. Minimums of windows of size `3` are `[10]`. Maximum of these minimums is `10`.

## Constraints
- `1 <= arr.size() <= 10^5`
- `1 <= arr[i] <= 10^6`

