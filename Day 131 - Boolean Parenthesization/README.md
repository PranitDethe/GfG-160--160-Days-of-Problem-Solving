# Boolean Parenthesization


## Problem Statement

You are given a boolean expression `s` containing:

- `'T'` ---> `true`
- `'F'` ---> `false`

and the following operators between symbols:

- `&`   ---> boolean AND
- `|`   ---> boolean OR
- `^`   ---> boolean XOR

Count the number of ways we can parenthesize the expression so that the value of the expression evaluates to `true`.

**Note:** The answer is guaranteed to fit within a 32-bit integer.

## Examples

### Example 1
**Input:**
```
s = "T|T&F^T"
```
**Output:**
```
4
```
**Explanation:**
The expression evaluates to `true` in 4 ways:
1. `((T|T)&(F^T))`
2. `(T|(T&(F^T)))`
3. `(((T|T)&F)^T)`
4. `(T|((T&F)^T))`

### Example 2
**Input:**
```
s = "T^F|F"
```
**Output:**
```
2
```
**Explanation:**
The expression evaluates to `true` in 2 ways:
1. `((T^F)|F)`
2. `(T^(F|F))`

## Constraints

- `1 ≤ |s| ≤ 100`

