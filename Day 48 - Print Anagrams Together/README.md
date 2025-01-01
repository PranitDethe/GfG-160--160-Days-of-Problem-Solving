# Print Anagrams Together

## Problem Statement
Given an array of strings, return all groups of strings that are anagrams. The groups must be created in the order of their appearance in the original array. The final output should be in lexicographic order.

---

## Examples

### Example 1
- **Input**:  
  `arr[] = ["act", "god", "cat", "dog", "tac"]`
- **Output**:  
  `[['act', 'cat', 'tac'], ['god', 'dog']]`
- **Explanation**:  
  There are two groups of anagrams:  
  - Group 1: `act`, `cat`, `tac`  
  - Group 2: `god`, `dog`

---

### Example 2
- **Input**:  
  `arr[] = ["no", "on", "is"]`
- **Output**:  
  `[['is'], ['no', 'on']]`
- **Explanation**:  
  There are two groups of anagrams:  
  - Group 1: `is`  
  - Group 2: `no`, `on`

---

### Example 3
- **Input**:  
  `arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]`
- **Output**:  
  `[['abc', 'cab', 'bac'], ['listen', 'silent', 'enlist'], ['rat', 'tar', 'art']]`
- **Explanation**:  
  There are three groups of anagrams:  
  - Group 1: `abc`, `bac`, `cab`  
  - Group 2: `listen`, `silent`, `enlist`  
  - Group 3: `rat`, `tar`, `art`

---

## Constraints
- `1 ≤ arr.size() ≤ 100`
- `1 ≤ arr[i].size() ≤ 10`
