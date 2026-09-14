select name  from
( 
    select e.name ,e.id from
Employee e join 
employee e1
on e.id=e1.managerId
group by e.name,e.id
having count(e1.managerId)>=5
) temp