# Matrix Chain Multiplication


## Problem Statement
Given an array `arr[]` which represents the dimensions of a sequence of matrices where the `ith` matrix has the dimensions `(arr[i-1] x arr[i])` for `i >= 1`, find the most efficient way to multiply these matrices together. The efficient way is the one that involves the least number of multiplications.

## Examples

### Example 1:
**Input:**  
`arr[] = [2, 1, 3, 4]`  
**Output:**  
`20`  
**Explanation:**  
There are 3 matrices with dimensions: `2 × 1`, `1 × 3`, and `3 × 4`.
Let these matrices be `M1, M2, and M3`. There are two ways to multiply:
- `((M1 x M2) x M3)`: Multiplications required = `(2 x 1 x 3) + (2 x 3 x 4) = 30`
- `(M1 x (M2 x M3))`: Multiplications required = `(1 x 3 x 4) + (2 x 1 x 4) = 20`

The minimum of these two is `20`.

### Example 2:
**Input:**  
`arr[] = [1, 2, 3, 4, 3]`  
**Output:**  
`30`  
**Explanation:**  
There are 4 matrices with dimensions: `1 × 2`, `2 × 3`, `3 × 4`, and `4 × 3`.
Let these matrices be `M1, M2, M3, and M4`. The minimum number of multiplications is obtained by `(((M1 x M2) x M3) x M4)`, and the minimum number is:
- `(1 x 2 x 3) + (1 x 3 x 4) + (1 x 4 x 3) = 30`

### Example 3:
**Input:**  
`arr[] = [3, 4]`  
**Output:**  
`0`  
**Explanation:**  
As there is only one matrix, there is no cost of multiplication.

## Constraints
- `2 ≤ arr.size() ≤ 100`
- `1 ≤ arr[i] ≤ 200`

