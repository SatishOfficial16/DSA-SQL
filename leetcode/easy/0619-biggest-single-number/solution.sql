# Write your MySQL query statement below
select max(num
)as num
from
(select max(num)as num
from Mynumbers
group by num
having count(*)=1
)temp