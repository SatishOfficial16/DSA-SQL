(SELECT u.NAME AS results

FROM  Users u
join MovieRating m
on u.user_id=m.user_id
group by u.user_id
order by count(*) desc,
u.name
limit 1
)

UNION ALL
(
select m.title as results
from Movierating m1
join Movies m
on m1.movie_id=m.movie_id
where m1.created_at >='2020-02-01'
and m1.created_at< '2020-03-01'
group by m.movie_id
order by avg(m1.rating) desc,
m.title
limit 1
);