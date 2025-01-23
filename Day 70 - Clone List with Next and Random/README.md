# Clone List with Next and Random

## Problem Description
You are given a special linked list with `n` nodes where each node has two pointers:  
- **Next Pointer**: Points to the next node in the singly linked list.  
- **Random Pointer**: Points to any random node in the linked list or `NULL`.

Your task is to construct a **deep copy** of this linked list. The deep copy should consist of the same number of new nodes, where:
- Each new node has the same value as its corresponding original node.
- Both the **next** and **random** pointers of the new nodes point to nodes in the **copied list**, maintaining the same relationships as in the original list.

### Important Notes:
- None of the pointers in the new list should point to nodes in the original list.
- The **original linked list** must remain **unchanged**.

---

## Examples

### Example 1
**Input:**  
`head = [[1, 3], [3, 3], [5, NULL], [9, 3]]`  

**Output:**  
`head = [[1, 3], [3, 3], [5, NULL], [9, 3]]`  

**Explanation:**  
- Node 1 points to Node 2 as its `NEXT` and Node 3 as its `RANDOM`.  
- Node 2 points to Node 3 as its `NEXT` and Node 3 as its `RANDOM`.  
- Node 3 points to Node 4 as its `NEXT` and `NULL` as its `RANDOM`.  
- Node 4 points to `NULL` as its `NEXT` and Node 3 as its `RANDOM`.  

---

### Example 2
**Input:**  
`head = [[1, 3], [2, 1], [3, 5], [4, 3], [5, 2]]`  

**Output:**  
`head = [[1, 3], [2, 1], [3, 5], [4, 3], [5, 2]]`  

**Explanation:**  
- Node 1 points to Node 2 as its `NEXT` and Node 3 as its `RANDOM`.  
- Node 2 points to Node 3 as its `NEXT` and Node 1 as its `RANDOM`.  
- Node 3 points to Node 4 as its `NEXT` and Node 5 as its `RANDOM`.  
- Node 4 points to Node 5 as its `NEXT` and Node 3 as its `RANDOM`.  
- Node 5 points to `NULL` as its `NEXT` and Node 2 as its `RANDOM`.  

---

### Example 3
**Input:**  
`head = [[7, NULL], [7, NULL]]`  

**Output:**  
`head = [[7, NULL], [7, NULL]]`  

**Explanation:**  
- Node 1 points to Node 2 as its `NEXT` and `NULL` as its `RANDOM`.  
- Node 2 points to `NULL` as its `NEXT` and `NULL` as its `RANDOM`.  

---

## Constraints
- `1 ≤ n ≤ 100`  
- `0 ≤ node->data ≤ 1000`
