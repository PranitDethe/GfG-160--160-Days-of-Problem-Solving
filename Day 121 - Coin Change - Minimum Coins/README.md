# Coin Change (Minimum Coins)

## Problem Statement
You are given an array `coins[]`, where each element represents a coin of a different denomination, and a target value `sum`. You have an unlimited supply of each coin type `{coins1, coins2, ..., coinsm}`.

Your task is to determine the **minimum number of coins** needed to obtain the target `sum`. If it is not possible to form the sum using the given coins, return **-1**.

---

## Examples

### Example 1:
**Input:**
```plaintext
coins[] = [25, 10, 5], sum = 30
```
**Output:**
```plaintext
2
```
**Explanation:**
Minimum 2 coins needed: `25` and `5`.

---

### Example 2:
**Input:**
```plaintext
coins[] = [9, 6, 5, 1], sum = 19
```
**Output:**
```plaintext
3
```
**Explanation:**
19 = `9 + 9 + 1`.

---

### Example 3:
**Input:**
```plaintext
coins[] = [5, 1], sum = 0
```
**Output:**
```plaintext
0
```
**Explanation:**
For `sum = 0`, we do not need any coins.

---

### Example 4:
**Input:**
```plaintext
coins[] = [4, 6, 2], sum = 5
```
**Output:**
```plaintext
-1
```
**Explanation:**
It is not possible to make the given sum.

---

## Constraints:
- `1 ≤ sum * coins.size() ≤ 10^6`
- `0 ≤ sum ≤ 10^4`
- `1 ≤ coins[i] ≤ 10^4`
- `1 ≤ coins.size() ≤ 10^3`

