# Ways to Reach the n'th Stair
 

## Problem Statement
There are `n` stairs, and a person standing at the bottom wants to reach the top. The person can climb either `1` stair or `2` stairs at a time. Your task is to count the number of ways the person can reach the top (order does matter).

## Examples

### Example 1:
**Input:**
```
n = 1
```
**Output:**
```
1
```
**Explanation:** There is only one way to climb 1 stair.

### Example 2:
**Input:**
```
n = 2
```
**Output:**
```
2
```
**Explanation:** There are 2 ways to reach the 2nd stair:
1. {1, 1}
2. {2}

### Example 3:
**Input:**
```
n = 4
```
**Output:**
```
5
```
**Explanation:** There are five ways to reach the 4th stair:
1. {1, 1, 1, 1}
2. {1, 1, 2}
3. {2, 1, 1}
4. {1, 2, 1}
5. {2, 2}

## Constraints
- `1 ≤ n ≤ 44`

The problem requires efficient computation due to constraints, and can be solved using dynamic programming or recursion with memoization.

