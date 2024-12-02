# Search Pattern (KMP Algorithm)

This repository contains a problem statement to find all occurrences of a pattern string within a text string using the **Knuth-Morris-Pratt (KMP) Algorithm**.

---

## Problem Statement

Given two strings, one text string `txt` and one pattern string `pat`, print the starting indices of all occurrences of the pattern in the text. The indices should be 0-based. If the pattern does not occur in the text, return an empty list.

---

### Examples

#### Example 1
- **Input**: 
  - `txt = "abcab"`
  - `pat = "ab"`
- **Output**: `[0, 3]`
- **Explanation**: 
  - The pattern `"ab"` occurs twice in the text, starting at indices 0 and 3.

#### Example 2
- **Input**: 
  - `txt = "abesdu"`
  - `pat = "edu"`
- **Output**: `[]`
- **Explanation**: 
  - The pattern `"edu"` is not found in the text.

#### Example 3
- **Input**: 
  - `txt = "aabaacaadaabaaba"`
  - `pat = "aaba"`
- **Output**: `[0, 9, 12]`
- **Explanation**: 
  - The pattern `"aaba"` occurs at indices 0, 9, and 12 in the text.

---

### Constraints

1. `1 ≤ txt.size() ≤ 10^6`
2. `1 ≤ pat.size() < txt.size()`
3. Both strings consist of lowercase English alphabets.
