select w.id
from Weather w
join weather w2
on datediff(w.recordDate,w2.recordDate)=1
where w.temperature - w2.temperature >0