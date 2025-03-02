# Decode the String

## Problem Statement

Given an encoded string `s`, the task is to decode it. The encoding rule is:

`k[encodedString]`, where the `encodedString` inside the square brackets is being repeated exactly `k` times. Note that `k` is guaranteed to be a positive integer, and `encodedString` contains only lowercase English alphabets.

**Note:** The test cases are generated so that the length of the output string will never exceed `10^5`.

## Examples

### Example 1:
**Input:**
```
s = "1[b]"
```
**Output:**
```
"b"
```
**Explanation:**
```
"b" is present only one time.
```

### Example 2:
**Input:**
```
s = "3[b2[ca]]"
```
**Output:**
```
"bcacabcacabcaca"
```
**Explanation:**
```
1. Inner substring "2[ca]" expands to "caca".
2. Now, new string becomes "3[bcaca]".
3. Similarly, "3[bcaca]" expands to "bcacabcacabcaca", which is the final result.
```

## Constraints
- `1 ≤ |s| ≤ 10^5`
- `1 ≤ k ≤ 100`

