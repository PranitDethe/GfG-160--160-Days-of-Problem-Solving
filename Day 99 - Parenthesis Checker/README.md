# Parenthesis Checker

**Difficulty:** Easy  
**Accuracy:** 28.56%  
**Submissions:** 641K+  
**Points:** 2  

## Problem Statement
Given a string `s`, composed of different combinations of `(` , `)`, `{`, `}`, `[`, `]`, verify the validity of the arrangement.  
An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

## Examples

### Example 1:
**Input:**  
`s = "[{()}]"`  
**Output:**  
`true`  
**Explanation:**  
All the brackets are well-formed.

### Example 2:
**Input:**  
`s = "[()()]{}"`  
**Output:**  
`true`  
**Explanation:**  
All the brackets are well-formed.

### Example 3:
**Input:**  
`s = "([]"`  
**Output:**  
`False`  
**Explanation:**  
The expression is not balanced as there is a missing `)` at the end.

### Example 4:
**Input:**  
`s = "([{]})"`  
**Output:**  
`False`  
**Explanation:**  
The expression is not balanced as there is a closing `]` before the closing `}`.

## Constraints:
- `1 ≤ s.size() ≤ 10^6`
- `s[i] ∈ {'{', '}', '(', ')', '[', ']'}`

