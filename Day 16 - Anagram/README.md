# Anagram Check

This repository contains a problem statement to determine if two given strings are anagrams of each other.

---

## Problem Statement

Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.
---

### Examples

#### Example 1
- **Input**: 
  - `s1 = "geeks"`
  - `s2 = "kseeg"`
- **Output**: `true`
- **Explanation**: Both strings have the same characters with the same frequency. Hence, they are anagrams.

#### Example 2
- **Input**: 
  - `s1 = "allergy"`
  - `s2 = "allergic"`
- **Output**: `false`
- **Explanation**: The characters in both strings are not the same. Hence, they are not anagrams.

#### Example 3
- **Input**: 
  - `s1 = "g"`
  - `s2 = "g"`
- **Output**: `true`
- **Explanation**: Both strings have the same character. Hence, they are anagrams.

---

### Constraints

1. `1 ≤ s1.size(), s2.size() ≤ 10^5`
2. Strings `s1` and `s2` consist of lowercase alphabets only.
