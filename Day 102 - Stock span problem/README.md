# Stock Span Problem


## Problem Statement
The stock span problem is a financial problem where we have a series of daily price quotes for a stock, and we need to calculate the span of stock price for all days. The span `arr[i]` of the stock price on a given day `i` is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.

## Examples

### Example 1:
**Input:**  
```
arr[] = [100, 80, 60, 70, 60, 75, 85]
```
**Output:**  
```
[1, 1, 1, 2, 1, 4, 6]
```
**Explanation:**  
Traversing the given input:
- Span for `100` is `1` (no previous elements greater than or equal to `100`).
- Span for `80` is `1` (only `80` itself is considered).
- Span for `60` is `1` (only `60` itself is considered).
- Span for `70` is `2` (includes `60, 70`).
- Span for `60` is `1` (only `60` itself is considered).
- Span for `75` is `4` (includes `60, 70, 60, 75`).
- Span for `85` is `6` (includes `80, 60, 70, 60, 75, 85`).

Thus, the output is `[1, 1, 1, 2, 1, 4, 6]`.

### Example 2:
**Input:**  
```
arr[] = [10, 4, 5, 90, 120, 80]
```
**Output:**  
```
[1, 1, 2, 4, 5, 1]
```
**Explanation:**  
Traversing the given input:
- Span for `10` is `1` (no previous elements greater than or equal to `10`).
- Span for `4` is `1` (only `4` itself is considered).
- Span for `5` is `2` (includes `4, 5`).
- Span for `90` is `4` (includes `10, 4, 5, 90`).
- Span for `120` is `5` (includes `10, 4, 5, 90, 120`).
- Span for `80` is `1` (only `80` itself is considered).

Thus, the output is `[1, 1, 2, 4, 5, 1]`.

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`

