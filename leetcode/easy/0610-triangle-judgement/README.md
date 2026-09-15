# Triangle Judgement

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Triangle`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| x           | int  |
| y           | int  |
| z           | int  |
+-------------+------+
In SQL, (x, y, z) is the primary key column for this table.
Each row of this table contains the lengths of three line segments.

```

 

Report for every three line segments whether they can form a triangle.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Triangle table:
+----+----+----+
| x  | y  | z  |
+----+----+----+
| 13 | 15 | 30 |
| 10 | 20 | 15 |
+----+----+----+
Output: 
+----+----+----+----------+
| x  | y  | z  | triangle |
+----+----+----+----------+
| 13 | 15 | 30 | No       |
| 10 | 20 | 15 | Yes      |
+----+----+----+----------+

```

## Solution

**Language:** SQL  
**Runtime:** 338 ms (beats 39.08%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-15T18:19:32.444Z  

```sql
# Write your MySQL query statement below
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle
```

---

[View on LeetCode](https://leetcode.com/problems/triangle-judgement/)