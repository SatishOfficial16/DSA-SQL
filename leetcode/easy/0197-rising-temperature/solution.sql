select w.id
from Weather w
join weather w2
on w.recordDate=date_add(w2.recordDate,interval 1 day)
where w.temperature> w2.temperature