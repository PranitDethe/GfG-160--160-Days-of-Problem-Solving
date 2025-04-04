# Gas Station

## Problem Statement

There are some gas stations along a circular route. You are given two integer arrays `gas[]`, denoting the amount of gas present at each station, and `cost[]`, denoting the cost of travelling to the next station. 

You have a car with an unlimited gas tank. You begin the journey with an empty tank from one of the gas stations.

Return the index of the starting gas station if it's possible to travel around the circuit without running out of gas at any station in a clockwise direction.

If there is no such starting station, return `-1`.

> **Note:** If a solution exists, it is guaranteed to be unique.

---

## Examples

### Example 1

**Input:**  
`gas[] = [4, 5, 7, 4]`  
`cost[] = [6, 6, 3, 5]`  

**Output:**  
`2`

**Explanation:**  
It is possible to travel around the circuit starting from station at index 2:  
- Start at station 2: gas = 7  
- Travel to station 3: gas = 7 - 3 + 4 = 8  
- Travel to station 0: gas = 8 - 5 + 4 = 7  
- Travel to station 1: gas = 7 - 6 + 5 = 6  
- Travel back to station 2: gas = 6 - 6 = 0  

### Example 2

**Input:**  
`gas[] = [1, 2, 3, 4, 5]`  
`cost[] = [3, 4, 5, 1, 2]`  

**Output:**  
`3`

**Explanation:**  
Start from station 3:  
- gas = 4  
- → 4 - 1 + 5 = 8  
- → 8 - 2 + 1 = 7  
- → 7 - 3 + 2 = 6  
- → 6 - 4 + 3 = 5  
- → 5 - 5 = 0

### Example 3

**Input:**  
`gas[] = [3, 9]`  
`cost[] = [7, 6]`  

**Output:**  
`-1`

**Explanation:**  
There is no gas station to start with such that you can complete the circuit.

---

## Constraints

- `1 ≤ gas.length, cost.length ≤ 10^6`  
- `1 ≤ gas[i], cost[i] ≤ 10^3`
