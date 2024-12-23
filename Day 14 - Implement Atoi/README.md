# Implement Atoi

## Problem Statement

Given a string `s`, the objective is to convert it into an integer without utilizing any built-in functions. Follow the rules for the `atoi()` conversion as described below:

---

## Conversion Rules for `atoi()`:

1. Skip any **leading whitespaces**.
2. Check for a **sign** (`+` or `-`). Default to positive (`+`) if no sign is present.
3. Read the integer:
   - Ignore leading zeros.
   - Stop reading once a non-digit character is encountered or the end of the string is reached.
   - If no digits are present, return `0`.
4. Handle overflow:
   - If the integer exceeds `2³¹ - 1`, return `2³¹ - 1` (`2147483647`).
   - If the integer is less than `-2³¹`, return `-2³¹` (`-2147483648`).

---

## Examples

### Example 1
- **Input**:  
  `s = "-123"`
- **Output**:  
  `-123`
- **Explanation**:  
  The string `-123` is converted to the integer `-123`.

---

### Example 2
- **Input**:  
  `s = "  -"`
- **Output**:  
  `0`
- **Explanation**:  
  No digits are present in the string. Therefore, the output is `0`.

---

### Example 3
- **Input**:  
  `s = " 1231231231311133"`
- **Output**:  
  `2147483647`
- **Explanation**:  
  The converted number exceeds `2³¹ - 1`, so the output is the maximum integer value, `2147483647`.

---

### Example 4
- **Input**:  
  `s = "-999999999999"`
- **Output**:  
  `-2147483648`
- **Explanation**:  
  The converted number is less than `-2³¹`, so the output is the minimum integer value, `-2147483648`.

---

### Example 5
- **Input**:  
  `s = "  -0012gfg4"`
- **Output**:  
  `-12`
- **Explanation**:  
  Only `-12` is read before encountering the non-digit character `g`.

---

## Constraints
- `1 ≤ |s| ≤ 15`
