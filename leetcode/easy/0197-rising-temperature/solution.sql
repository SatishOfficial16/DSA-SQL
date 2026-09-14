select id 
from 
(
   select id ,recordDate,temperature,
   lag(temperature) over(order by recordDate)as pt,
   lag(recordDate) over (order by recordDate)as pd
   from Weather

)as temp
where temperature>pt and
recordDate=date_Add(pd,interval 1 day)