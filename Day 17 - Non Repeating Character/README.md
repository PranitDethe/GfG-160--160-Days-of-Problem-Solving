# Non-Repeating Character Finder

This repository contains a problem statement to find the first non-repeating character in a string. If no such character exists, return `$`.

---

## Problem Statement

Given a string `s` consisting of lowercase Latin Letters. Return the first non-repeating character in `s`. If there is no non-repeating character, return `$`.

**Note**: When you return `$` driver code will output `-1`.

---

### Examples

#### Example 1
- **Input**: 
  - `s = "geeksforgeeks"`
- **Output**: `'f'`
- **Explanation**: 
  - In the given string, `'f'` is the first character that does not repeat.

#### Example 2
- **Input**: 
  - `s = "racecar"`
- **Output**: `'e'`
- **Explanation**: 
  - In the given string, `'e'` is the only character that does not repeat.

#### Example 3
- **Input**: 
  - `s = "aabbccc"`
- **Output**: `-1`
- **Explanation**: 
  - All the characters in the given string are repeating.

---

### Constraints

1. `1 ≤ s.size() ≤ 10^5`
2. The string `s` consists of lowercase Latin letters only.
