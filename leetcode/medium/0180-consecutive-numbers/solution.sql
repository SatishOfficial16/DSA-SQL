# Write your MySQL query statement below
select distinct num as "ConsecutiveNums"
from 
(
    select num,
    lead(num,1) over(order by id) num1,
    lead(num,2)over (order by id) num2
    from Logs
)temp
where (num=num1) and (num1=num2)

