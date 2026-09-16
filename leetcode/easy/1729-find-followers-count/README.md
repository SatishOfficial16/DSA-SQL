# Find Followers Count

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Followers`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| user_id     | int  |
| follower_id | int  |
+-------------+------+
(user_id, follower_id) is the primary key (combination of columns with unique values) for this table.
This table contains the IDs of a user and a follower in a social media app where the follower follows the user.
```

 

Write a solution that will, for each user, return the number of followers.

Return the result table ordered by `user_id` in ascending order.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Followers table:
+---------+-------------+
| user_id | follower_id |
+---------+-------------+
| 0       | 1           |
| 1       | 0           |
| 2       | 0           |
| 2       | 1           |
+---------+-------------+
Output: 
+---------+----------------+
| user_id | followers_count|
+---------+----------------+
| 0       | 1              |
| 1       | 1              |
| 2       | 2              |
+---------+----------------+
Explanation: 
The followers of 0 are {1}
The followers of 1 are {0}
The followers of 2 are {0,1}

```

## Solution

**Language:** SQL  
**Runtime:** 1650 ms (beats 5.01%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-16T15:19:50.803Z  

```sql
select user_id,count(user_id)as followers_count
from Followers
where follower_id !=user_id and follower_id is not Null
group by user_id
order by user_id
```

---

[View on LeetCode](https://leetcode.com/problems/find-followers-count/)