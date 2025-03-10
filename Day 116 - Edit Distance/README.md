# Edit Distance


## Problem Statement

Given two strings `s1` and `s2`, return the minimum number of operations required to convert `s1` to `s2`.

The possible operations are:
1. Insert a character at any position in the string.
2. Remove any character from the string.
3. Replace any character from the string with any other character.

## Examples

### Example 1:
**Input:**  
`s1 = "geek"`, `s2 = "gesek"`  
**Output:**  
`1`  
**Explanation:**  
One operation is required: inserting 's' between the two 'e' in `s1`.

### Example 2:
**Input:**  
`s1 = "gfg"`, `s2 = "gfg"`  
**Output:**  
`0`  
**Explanation:**  
Both strings are the same; no operations are needed.

### Example 3:
**Input:**  
`s1 = "abcd"`, `s2 = "bcfe"`  
**Output:**  
`3`  
**Explanation:**  
We can convert `s1` into `s2` by performing the following operations:
- Remove ‘a’
- Replace ‘d’ with ‘f’
- Insert ‘e’ at the end

## Constraints
- `1 ≤ s1.length(), s2.length() ≤ 10^3`
- Both strings consist of only lowercase English letters.

