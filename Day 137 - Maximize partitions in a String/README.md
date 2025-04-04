# Maximize Partitions in a String

---

## Problem Statement

Given a string `s` of lowercase English alphabets, your task is to return the **maximum number of substrings** formed after possible partitions (possibly zero) of `s` such that **no two substrings have a common character**.

You can choose to partition the string at various points such that each resulting substring contains unique characters **not shared** with other substrings.

---

## Examples

### Example 1

**Input:**  
`s = "acbbcc"`  

**Output:**  
`2`  

**Explanation:**  
The string can be partitioned into `"a"` and `"cbbcc"`.  
These substrings do not share any common characters.

---

### Example 2

**Input:**  
`s = "ababcbacadefegdehijhklij"`  

**Output:**  
`3`  

**Explanation:**  
Partitioning at index 8 and 15 gives substrings:  
- `"ababcbaca"`
- `"defegde"`
- `"hijhklij"`  
None of these substrings share characters with each other.

---

### Example 3

**Input:**  
`s = "aaa"`  

**Output:**  
`1`  

**Explanation:**  
All characters are the same, so the entire string is one valid substring.  
No further partition can be done to avoid shared characters.

---

## Constraints

- `1 ≤ s.length ≤ 10^5`  
- `'a' ≤ s[i] ≤ 'z'`  
