# Write your MySQL query statement belows
select s.product_id,temp.first_year,s.quantity,s.price 
from  Sales s
join 
(
    select product_id, min(year)as first_year
    from Sales 
    group by product_id
)as temp 
on s.product_id=temp.product_id
and s.year=temp.first_year
