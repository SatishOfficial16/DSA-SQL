# Customers Who Bought All Products

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Table: `Customer`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| customer_id | int     |
| product_key | int     |
+-------------+---------+
This table may contain duplicates rows. 
customer_id is not NULL.
product_key is a foreign key (reference column) to Product table.

```

 

Table: `Product`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| product_key | int     |
+-------------+---------+
product_key is the primary key (column with unique values) for this table.

```

 

Write a solution to report the customer ids from the `Customer` table that bought all the products in the `Product` table.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Customer table:
+-------------+-------------+
| customer_id | product_key |
+-------------+-------------+
| 1           | 5           |
| 2           | 6           |
| 3           | 5           |
| 3           | 6           |
| 1           | 6           |
+-------------+-------------+
Product table:
+-------------+
| product_key |
+-------------+
| 5           |
| 6           |
+-------------+
Output: 
+-------------+
| customer_id |
+-------------+
| 1           |
| 3           |
+-------------+
Explanation: 
The customers who bought all the products (5 and 6) are customers with IDs 1 and 3.

```

## Solution

**Language:** SQL  
**Runtime:** 763 ms (beats 18.04%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-16T15:41:43.936Z  

```sql
# Write your MySQL query statement below
select c.customer_id
from Customer c
join Product p
on c.product_key=p.product_key
group by c.customer_id
having count( distinct p.product_key)=(select count(product_key) from Product)

```

---

[View on LeetCode](https://leetcode.com/problems/customers-who-bought-all-products/)