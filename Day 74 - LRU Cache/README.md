# LRU Cache

## Problem Description
Design a data structure that works like an **LRU (Least Recently Used) Cache**.  
The cache has a **fixed capacity (`cap`)**, and it supports the following operations:

- `PUT x y`: Sets the value of the key `x` with value `y`.
- `GET x`: Retrieves the value of key `x` if present, otherwise returns `-1`.

### Functionality:
1. **get(key)**:
   - Returns the value associated with `key` if it exists in the cache.
   - Otherwise, returns `-1`.

2. **put(key, value)**:
   - If `key` already exists, update its value and mark it as most recently used.
   - If `key` is not present, insert the key-value pair into the cache.
   - If the cache is full, **remove the least recently used item** before inserting a new item.

### Cache Initialization:
- The constructor of the class should initialize the cache with the given capacity (`cap`).

---

## Examples

### Example 1
**Input:**  
`cap = 2, Q = 2, Queries = [["PUT", 1, 2], ["GET", 1]]`  

**Output:**  
`[2]`  

**Explanation:**  
1. `PUT 1 2` → Inserts (1,2) into the cache.  
2. `GET 1` → Returns `2` as key `1` is present in the cache.  

---

### Example 2
**Input:**  
`cap = 2, Q = 8, Queries = [["PUT", 1, 2], ["PUT", 2, 3], ["PUT", 1, 5], ["PUT", 4, 5], ["PUT", 6, 7], ["GET", 4], ["PUT", 1, 2], ["GET", 3]]`  

**Output:**  
`[5, -1]`  

**Explanation:**  
1. `PUT 1 2` → Inserts (1,2) in the cache.  
2. `PUT 2 3` → Inserts (2,3) in the cache. Cache state: **[1 → 2, 2 → 3]**.  
3. `PUT 1 5` → Updates (1,2) to (1,5). Cache state: **[2 → 3, 1 → 5]**.  
4. `PUT 4 5` → Inserts (4,5), removing the least recently used (2,3). Cache state: **[1 → 5, 4 → 5]**.  
5. `PUT 6 7` → Inserts (6,7), removing the least recently used (1,5). Cache state: **[4 → 5, 6 → 7]**.  
6. `GET 4` → Returns `5`. Cache state: **[6 → 7, 4 → 5]**.  
7. `PUT 1 2` → Inserts (1,2), removing the least recently used (6,7). Cache state: **[4 → 5, 1 → 2]**.  
8. `GET 3` → Returns `-1` as key `3` is not in the cache.  

---

## Constraints
- `1 ≤ cap ≤ 10³`
- `1 ≤ Q ≤ 10⁵`
- `1 ≤ x, y ≤ 10⁴`
