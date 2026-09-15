select round(sum(d.order_date=d.customer_pref_delivery_date )*100/count(*),2) as immediate_percentage from 
Delivery d
join 
(
    select customer_id,min(order_date)as first_order
    from Delivery 
    group by customer_id
) as dt
on d.customer_id=dt.customer_id
and d.order_date=dt.first_order