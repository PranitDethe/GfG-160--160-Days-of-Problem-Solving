# Implement Trie

## Problem Statement

Implement a `Trie` class and complete the following methods for a series of queries:

- **Type 1:** `(1, word)` — calls `insert(word)` function and inserts the word into the Trie
- **Type 2:** `(2, word)` — calls `search(word)` function to check whether the word exists in the Trie
- **Type 3:** `(3, word)` — calls `isPrefix(word)` function to check whether the word exists as a prefix of any string in the Trie

## Examples

### Example 1
**Input:**
```  
query[][] = [[1, "abcd"], [1, "abc"], [1, "bcd"], [2, "bc"], [3, "bc"], [2, "abc"]]
```
**Output:**
```  
[false, true, true]
```
**Explanation:**
- The string "bc" does not exist in the Trie
- "bc" exists as a prefix of the word "bcd" in the Trie
- "abc" exists in the Trie

### Example 2
**Input:**
```  
query[][] = [[1, "gfg"], [1, "geeks"], [3, "fg"], [3, "geek"], [2, "for"]]
```
**Output:**
```  
[false, true, false]
```
**Explanation:**
- The string "for" is not present in the Trie
- "fg" is not a valid prefix in the Trie
- "geek" is a valid prefix of the word "geeks" in the Trie

## Constraints
- $1 \leq \text{query.size()} \leq 10^4$
- $1 \leq \text{word.size()} \leq 10^3$

---

Implement the class with optimal time and space complexity for each operation.

