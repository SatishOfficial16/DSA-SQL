# Write your MySQL query statement below
select r.contest_id, round(count(distinct r.user_id)*100/(select count(*) from users),2)as percentage
from users u left join 
Register r
on u.user_id=r.user_id
where r.contest_id is not null
group by contest_id
order by percentage desc,
contest_id asc;