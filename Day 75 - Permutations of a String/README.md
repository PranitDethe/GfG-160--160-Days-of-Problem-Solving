# Permutations of a String

## Problem Description
Given a string `s`, which may contain duplicate characters, your task is to generate and return an array of all **unique permutations** of the string. You can return the answer in **any order**.

---

## Examples

### Example 1
**Input:**  
`s = "ABC"`  

**Output:**  
`["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]`  

**Explanation:**  
The given string "ABC" has **6 unique permutations**.

---

### Example 2
**Input:**  
`s = "ABSG"`  

**Output:**  
`["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]`  

**Explanation:**  
The given string "ABSG" has **24 unique permutations**.

---

### Example 3
**Input:**  
`s = "AAA"`  

**Output:**  
`["AAA"]`  

**Explanation:**  
No other unique permutations can be formed as all characters are the same.

---

## Constraints
- `1 ≤ s.size() ≤ 9`
- `s` contains only **uppercase English alphabets**.
